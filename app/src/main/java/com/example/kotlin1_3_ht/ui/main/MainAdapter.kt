package com.example.kotlin1_3_ht.ui.main

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kotlin1_3_ht.ui.calculate.CalculateFragment
import com.example.kotlin1_3_ht.ui.home.HomeFragment
import com.example.kotlin1_3_ht.ui.list.ListFragment

class MainAdapter(activity: AppCompatActivity, private val itemCounts: Int): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return itemCounts
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> CalculateFragment()
            1 -> HomeFragment()
            2 -> ListFragment()
            else -> Fragment()
        }
    }

}