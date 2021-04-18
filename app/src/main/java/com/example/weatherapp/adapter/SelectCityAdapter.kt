package com.example.weatherapp.adapter

import com.example.weatherapp.R
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.view_select_city_adapter.view.*

class SelectCityAdapter : Item<ViewHolder>() {

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tvName.text = ""
        viewHolder.itemView.tvTemperature.text = ""

        Picasso.get().load("").into(viewHolder.itemView.image)
    }

    override fun getLayout(): Int {
        return R.layout.view_select_city_adapter
    }
}