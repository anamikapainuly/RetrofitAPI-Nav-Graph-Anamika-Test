package com.anupras.apl.anamika_test.ui.weather.future.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.anupras.apl.anamika_test.R
import com.anupras.apl.anamika_test.constant.CITY_NAME
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.future_detail_weather_fragment.*


class FutureDetailWeatherFragment : Fragment() {

    companion object {
        fun newInstance() =
            FutureDetailWeatherFragment()
    }

    private lateinit var viewModel: FutureDetailWeatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.future_detail_weather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FutureDetailWeatherViewModel::class.java)

        textView_city_name_detail.text = CITY_NAME

        date_to_show_detail.text = arguments?.getString("day")
        textView_condition_detail.text = arguments?.getString("description").toString().capitalize()
        textView_temperature_detail.text = arguments?.getString("temp")
        textView_min_max_temperature_detail.text = arguments?.getString("tempMinMax")


        val options: RequestOptions = RequestOptions()
            .centerCrop()
            .error(R.mipmap.ic_launcher_round)



        Glide .with(this)
              .load(arguments?.getString("icon").toString()).apply(options)
              .into(imageView_condition_icon_detail)




    }

}