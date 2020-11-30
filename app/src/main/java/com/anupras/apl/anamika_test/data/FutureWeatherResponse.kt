package com.anupras.apl.anamika_test.data

import com.google.gson.annotations.SerializedName


data class FutureWeatherResponse (

    @SerializedName("list")
    val forecast : List<ForecastDetail> ? =  ArrayList(),

    @SerializedName("city") var city : City


)



data class ForecastDetail(
    @SerializedName("dt") var  date: Long?,
    @SerializedName("temp") var temperature : Temperature?,
    @SerializedName("weather") var description : List<WeatherDescription>,
    @SerializedName("pressure") var pressure : Double?,
    @SerializedName("humidity") var humidity :Double?)

data class City(
    @SerializedName("name") var cityName : String,
    @SerializedName("country") var country : String)

data class Temperature (
    @SerializedName("day") var dayTemperature: Double,
    @SerializedName("night") var nightTemperature: Double)

data class WeatherDescription(
    @SerializedName("main") var main : String,
    @SerializedName("description") var description: String,
    @SerializedName("icon") var icon: String)

