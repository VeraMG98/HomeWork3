package com.example.kotlin1_3_ht.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.StringBuilder

class MainViewModel: ViewModel() {
    private var mCounter = 0
    val counter = MutableLiveData<Int?>()
    val operation = MutableLiveData<String>()

    fun onAdditionBtnClick(){
        mCounter++
        counter.value = mCounter
        operation.value += " + "
    }

    fun onSubtractionBtnClick(){
        mCounter--
        counter.value = mCounter
        operation.value += " - "
    }

    init {
        operation.postValue("")
    }

}