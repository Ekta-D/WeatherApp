package com.example.weatherapp.service


object ApiFactory {

    val api: Service = RetrofitFactory.retrofit().create(Service::class.java)
}