package com.angkorsuntrix.android_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.angkorsuntrix.android_kotlin.adapter.MainPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(main_toolbar)
        main_pager.adapter = MainPagerAdapter(supportFragmentManager)
        main_navigator.setOnCheckedChangeListener { radioGroup, i ->
            if(i == R.id.attendance_id){
                main_pager.setCurrentItem(0,false)
            }else if(i == R.id.student_id){
                main_pager.setCurrentItem(1,false)
            }else if(i ==R.id.class_id){
                main_pager.setCurrentItem(2,false)
            }
        }
    }
}
