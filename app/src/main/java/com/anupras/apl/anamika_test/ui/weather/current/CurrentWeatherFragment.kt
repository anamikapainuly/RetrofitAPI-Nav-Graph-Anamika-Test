package com.anupras.apl.anamika_test.ui.weather.current

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.anupras.apl.anamika_test.R
import com.anupras.apl.anamika_test.constant.CITY_NAME
import com.anupras.apl.anamika_test.constant.UNIT
import com.anupras.apl.anamika_test.service.OpenWeatherApiService
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.current_weather_fragment.*
import kotlinx.android.synthetic.main.current_weather_fragment.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*


class CurrentWeatherFragment : Fragment() {


    companion object {
        fun newInstance() =
            CurrentWeatherFragment()
    }

    private lateinit var viewModel: CurrentWeatherViewModel
    lateinit var cityText :String




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.current_weather_fragment, container, false)



        //Button click to see weather of entered city
        view.search_btn_current.setOnClickListener { view ->

            //Hide Keyboard
            hideSoftKeyboard(activity!!)

            //Get city name from EditText
            var cityNameEntered = input_city_current.text.toString()

            if (cityNameEntered!=""){

                CITY_NAME=cityNameEntered
                loadApi(CITY_NAME)
            }
            textView_city_name_current.text= CITY_NAME
        }


        // Return the fragment view/layout
        return view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CurrentWeatherViewModel::class.java)
        //Load Data of default city
        loadApi(CITY_NAME)

       // val cityText= input_city_current.text.toString()

        // TODO: Use the ViewModel
    }

    fun hideSoftKeyboard(activity: Activity) {
        val inputMethodManager =
            activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(activity.currentFocus!!.windowToken, 0)
    }

    private fun loadApi(CITY_NAME: String) {
        val apiService = OpenWeatherApiService()

        GlobalScope.launch(Dispatchers.Main) {
            val currentWeatherResponse = apiService.getCurrentWeather(CITY_NAME, UNIT).await()

            textView_temperature_current.text =
                currentWeatherResponse.currentWeatherEntry.temp.toString() + "°C"
            textView_min_max_temperature_current.text =
                "Min: " + currentWeatherResponse.currentWeatherEntry.tempMin.toString() + "°C" + "," + "Max: " + currentWeatherResponse.currentWeatherEntry.tempMax.toString() + "°C"

            //DESCRIPTION
            textView_condition_current.text= currentWeatherResponse.weather[0].description.capitalize()

            val dateReceived: Long = currentWeatherResponse.dt
            //val time = Date(date_received as Long * 1000)

            date_to_show_current.text= dateReceived?.let { getData(it) }
            textView_city_name_current.text=currentWeatherResponse.name

            Glide.with(this@CurrentWeatherFragment)
                .load("http://openweathermap.org/img/w/${currentWeatherResponse.weather[0].icon}.png")
                .into(imageView_condition_icon_current)

        }

    }

    private fun getData(dt: Long): String? {
        val timeFormatter = SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z")
        return timeFormatter.format(Date(dt * 1000L))
    }



}
