package com.anupras.apl.anamika_test.service
import com.anupras.apl.anamika_test.BuildConfig
import com.anupras.apl.anamika_test.data.FutureWeatherResponse
import com.anupras.apl.anamika_test.data.currentweatherresponse.CurrentWeatherResponse
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

// https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={your api key}

interface OpenWeatherApiService {

    @GET("weather")
    fun getCurrentWeather(
        @Query("q") location: String,
        @Query("units") units: String
    ): Deferred<CurrentWeatherResponse>

    @GET("forecast/daily")
    fun getFutureWeather(
       // @Query("id") location: String
        @Query("q") location: String,
        @Query("units") units: String,
        @Query("cnt") cnt: String

    ): Deferred<FutureWeatherResponse>

    companion object {
        operator fun invoke() : OpenWeatherApiService{

            val requestInterceptor = Interceptor { chain ->

                val url = chain.request()
                    .url()
                    .newBuilder()
                    .addQueryParameter("appid", BuildConfig.API_KEY)
                    .build()
                val request = chain.request()
                    .newBuilder()
                    .url(url)
                    .build()

                return@Interceptor chain.proceed(request)
            }

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(requestInterceptor)
                .build()

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://api.openweathermap.org/data/2.5/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(OpenWeatherApiService::class.java)
        }
    }
}