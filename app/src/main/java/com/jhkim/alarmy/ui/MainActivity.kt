package com.jhkim.alarmy.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jhkim.alarmy.R
import com.jhkim.alarmy.ui.fragment.AlarmRecyclerViewFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment(0)
    }

    private fun setFragment(fragmentNum: Int) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()

        when (fragmentNum) {
            0 -> {
                fragmentTransaction.replace(R.id.activity_main_fl, AlarmRecyclerViewFragment()).commit()
            }


        }
    }
}