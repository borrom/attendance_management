package com.angkorsuntrix.android_kotlin.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

import com.angkorsuntrix.android_kotlin.fragment.AttendanceFragment
import com.angkorsuntrix.android_kotlin.fragment.ClassFragment
import com.angkorsuntrix.android_kotlin.fragment.StudentFragment

/**
 * Created by borrom on 1/8/16.
 */
class MainPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        if(position == 0){
            return AttendanceFragment()
        }else if(position == 1){
            return StudentFragment()
        }else {
            return ClassFragment()
        }
    }

    override fun getCount(): Int {
        return ALL
    }


    companion object  {

        private val ALL = 3
    }
}
