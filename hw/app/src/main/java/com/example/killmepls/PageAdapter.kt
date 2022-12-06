package com.example.killmepls

import android.content.res.Resources.NotFoundException
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PageAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount() = 4

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {FirstFragment()}
            1 -> {SecondFragment()}
            2 -> {ThirdFragment()}
            3 -> {FourthFragment()}
            else -> {throw NotFoundException("position not found") }
        }
    }
}