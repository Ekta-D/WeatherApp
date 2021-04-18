package com.example.weatherapp

import android.util.Log
import com.example.weatherapp.service.ApiFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(JUnit4::class)
class WeatherTest {
    @Test
    fun weatherTest() {
        val service = ApiFactory.api

        GlobalScope.launch(Dispatchers.Main) {
            val request = service.getWeather()

            try {
                val response = request.await()
                if (response.isSuccessful) {
                    Log.v("WeatherTest", response.body().toString())
                } else {
                    Log.d("WeatherTest", response.errorBody().toString())
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}