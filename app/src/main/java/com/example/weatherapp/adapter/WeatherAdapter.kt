package com.example.weatherapp.adapter


import com.example.weatherapp.R
import com.example.weatherapp.objects.WeatherItem
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.view_weather_adapter.view.*


class WeatherAdapter(private var item: WeatherItem): Item<ViewHolder>() {

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tvDate.text = item.dt_txt
        viewHolder.itemView.tvTemperature.text = kelvinToCelsius(item.main.temp)
        viewHolder.itemView.tvTempMin.text = kelvinToCelsius(item.main.temp_min)
        viewHolder.itemView.tvTempMax.text = kelvinToCelsius(item.main.temp_max)
        viewHolder.itemView.tvPressure.text = "${item.main.pressure} hPa"
        viewHolder.itemView.tvSeaLevel.text = "${item.main.sea_level} hPa"
        viewHolder.itemView.tvGrndLevel.text = "${item.main.grnd_level} hPa"
        viewHolder.itemView.tvHumidity.text = "${item.main.humidity.toInt()}%"
        viewHolder.itemView.tvTempKf.text = item.main.temp_kf.toString()

        viewHolder.itemView.tvMainDescription.text = "${item.weather[0].main} - ${item.weather[0].description}"
        viewHolder.itemView.tvSpeedDeg.text = "Speed: ${item.wind.speed} - Deg: ${item.wind.deg}"
    }

    override fun getLayout(): Int {
        return R.layout.view_weather_adapter
    }

    private fun kelvinToCelsius(kelvin: Float): String {
        return "${(kelvin - 273.15).toInt()}º"
    }
}