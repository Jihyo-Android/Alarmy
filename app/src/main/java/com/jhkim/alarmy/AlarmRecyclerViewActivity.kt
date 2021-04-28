package com.jhkim.alarmy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class AlarmRecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_recycler_view)



        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {

            }
        }
    }

}