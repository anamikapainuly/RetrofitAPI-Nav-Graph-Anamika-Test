package com.anupras.apl.anamika_test.data.currentweatherresponse

import com.google.gson.annotations.SerializedName
import java.util.ArrayList

//MAIN RESPONSE FILE

data class CurrentWeatherResponse(
//  val base: String,
//  val clouds: Clouds,
//  val cod: Int,
//  val coord: Coord,
//  val id: Int,
//  val sys: Sys,
//  val visibility: Int,
//  val wind: Wind
    
    val dt: Long,        //DATE
    val name: String,   //CITY NAME

    @SerializedName("main")
    val currentWeatherEntry: CurrentWeatherEntry,   //Main renamed to CurrentWeatherEntry
    val weather: List<Weather>

)

data class CurrentWeatherEntry(
    val humidity: Int,
    val pressure: Int,
    val temp: Double,
    @SerializedName("temp_max")
    val tempMax: Double,
    @SerializedName("temp_min")
    val tempMin: Double
)

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)

data class Wind(
    val deg: Int,
    val speed: Double
)


