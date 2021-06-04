package com.example.kotlin1_3_ht

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.kotlin1_3_ht.ui.calculate.CalculateFragment
import com.example.kotlin1_3_ht.ui.home.HomeFragment
import com.example.kotlin1_3_ht.ui.list.ListFragment
import com.example.kotlin1_3_ht.ui.main.MainAdapter
import com.example.kotlin1_3_ht.ui.main.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var previewMenuItem: MenuItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val adapter = MainAdapter(this, 3)
        view_pager.adapter = adapter

        navigation_view.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.menu_optionI -> {
                    view_pager.currentItem = 0
                }

                R.id.menu_optionII -> {
                    view_pager.currentItem = 1
                }

                R.id.menu_optionIII -> {
                    view_pager.currentItem = 2
                }
            }

            true
        }

        view_pager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                if (::previewMenuItem.isInitialized){
                    previewMenuItem.isChecked = false
                } else {
                    navigation_view.menu.getItem(0).isChecked = true
                }
                navigation_view.menu.getItem(position).isChecked = true
                previewMenuItem = navigation_view.menu.getItem(position)
            }

        })
    }
}