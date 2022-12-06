package com.example.killmepls

import android.annotation.SuppressLint
import android.content.res.Resources.NotFoundException
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = PageAdapter(this)
        TabLayoutMediator(tabLayout,viewPager){ tab,index ->
            tab.text = when(index){
                0 -> { "Tab1" }
                1 -> { "Tab2" }
                2 -> { "Tab3" }
                3 -> { "Tab4" }
                else -> { throw NotFoundException("position not found")}
            }
        }.attach()
    }
}