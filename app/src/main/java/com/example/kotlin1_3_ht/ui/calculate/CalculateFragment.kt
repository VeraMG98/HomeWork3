package com.example.kotlin1_3_ht.ui.calculate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin1_3_ht.R
import com.example.kotlin1_3_ht.ui.main.MainViewModel
import kotlinx.android.synthetic.main.fragment_calculate.*

class CalculateFragment : Fragment() {

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_calculate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickBtnPlus()
        clickBtnMinus()
    }

    private fun clickBtnMinus() {
        minus.setOnClickListener {
            viewModel.onSubtractionBtnClick()
        }
    }

    private fun clickBtnPlus() {
        plus.setOnClickListener {
            viewModel.onAdditionBtnClick()
        }
    }
}