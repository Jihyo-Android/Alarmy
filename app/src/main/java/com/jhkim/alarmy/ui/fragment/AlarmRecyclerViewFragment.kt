package com.jhkim.alarmy.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jhkim.alarmy.R

class AlarmRecyclerViewFragment: Fragment(R.layout.fragment_alarm_recyclerview) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_alarm_recyclerview, container, false)


        return view
    }
}