package com.example.weatherapp.service


import com.example.weatherapp.objects.OpenWeather
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET


interface Service {

    @GET("forecast?q=Dublin,IE&APPID=1af9031b36210770055780c9e6c073f7")
    fun getWeather(): Deferred<Response<OpenWeather>>
}