package com.anupras.apl.anamika_test.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.anupras.apl.anamika_test.R
import com.anupras.apl.anamika_test.data.ForecastDetail
import com.anupras.apl.anamika_test.ui.weather.future.list.FutureListWeatherFragmentDirections
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_future_weather.view.*
import java.text.SimpleDateFormat
import java.util.*

class ForecastsWeatherAdapter(
    private val dataList: ArrayList<ForecastDetail>,
    private val context: Context
) : RecyclerView.Adapter<ForecastsWeatherAdapter.ForecastViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
        val rootView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_future_weather,
            parent,
            false
        )
        return ForecastViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {

        dataList[position].let {
            holder.bind(forecastElement = it)
        }
    }
    override fun getItemCount(): Int {
        return dataList.size
    }

        class ForecastViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(forecastElement: ForecastDetail) {

            val temMinMax: String="Day Temp: ${forecastElement.temperature?.dayTemperature}°C"+","+ " Night Temp: ${forecastElement.temperature?.nightTemperature}°C"
            val temperatureVar: String="${forecastElement.temperature?.dayTemperature} °C"
            val descriptionVar: String="${forecastElement.description[0].description}"
            val imageUrlVar: String="http://openweathermap.org/img/w/${forecastElement.description[0].icon}.png"
            val dateVar: String="${forecastElement.date?.let { getData(it)}}"

            itemView.setOnClickListener {
                Log.d("CHECK....", "position = " +   "${forecastElement.temperature?.dayTemperature} °C")
                showWeatherDetail(dateVar, descriptionVar,temperatureVar,imageUrlVar,temMinMax, itemView);

          }



            //Display temperature
            itemView.textView_temperature_future.text = temperatureVar

            //Display Date
            itemView.textView_date_future.text = "${forecastElement.date?.let { getDay(it)}}"

            //Display weather icon
                Glide.with(itemView.context)
                    .load(imageUrlVar)
                    .into(itemView.imageView_condition_icon_future)
            //Display condition
            itemView.textView_condition_future.text= descriptionVar.capitalize()


        }

        private fun showWeatherDetail(date:String, descriptionVar: String,temperatureVar: String,imageUrlVar: String,temMinMax: String, view: View) {
            val actionDetail = FutureListWeatherFragmentDirections.actionDetail(date, descriptionVar, temperatureVar, imageUrlVar, temMinMax)
            Navigation.findNavController(view).navigate(actionDetail)

        }

        private fun getData(dt: Long): String? {
            //val timeFormatter = SimpleDateFormat("\"dd-EEEE, MM, yyyy\"")
            val timeFormatter = SimpleDateFormat("E, dd MMM yyyy")
            return timeFormatter.format(Date(dt * 1000L))
        }

            private fun getDay(dt: Long): String? {
                //val timeFormatter = SimpleDateFormat("\"dd-EEEE, MM, yyyy\"")
                val timeFormatter = SimpleDateFormat("EEEE")
                return timeFormatter.format(Date(dt * 1000L))
            }


    }

}
