package com.example.weatherapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_select_city.*


class SelectCityFragment : Fragment() {

    //region Variables
    private var adapter = GroupAdapter<ViewHolder>()
    //endregion

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select_city, container, false)
    }

    override fun onStart() {
        super.onStart()

        fab.setOnClickListener {

        }
    }
}
