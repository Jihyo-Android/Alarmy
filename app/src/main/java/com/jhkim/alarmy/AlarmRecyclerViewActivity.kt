package com.jhkim.alarmy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_alarm_recycler_view.*

class AlarmRecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_recycler_view)


    }

}

//class AlarmAdapter(
//
//) : RecyclerView.Adapter<AlarmAdapter.AlarmViewHolder>() {
//
//    override fun onCreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ): AlarmAdapter.AlarmViewHolder {
//
//    }
//
//    override fun getItemCount(): Int {
//
//    }
//
//    override fun onBindViewHolder(holder: AlarmAdapter.AlarmViewHolder, position: Int) {
//
//    }
//}