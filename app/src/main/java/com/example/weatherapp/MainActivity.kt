package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    //endregion

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId) {
            R.id.nav_about -> {
                AlertDialog.Builder(this@MainActivity)
                    .setTitle(R.string.about_this_app)
                    .setMessage(R.string.about_this_app_message)
                    .create()
                    .show()
            }

            R.id.nav_select_city -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, SelectCityFragment())
                    .commit()
            }
        }

        return super.onOptionsItemSelected(item)
    }



    //endregion

    //region onBackPressed
    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
    //endregion

    companion object {
        private val TAG = MainActivity::class.java.name.toString()
    }
}