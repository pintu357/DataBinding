package com.example.practice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val status = MutableLiveData(" Pintu Kumar")

    fun updateName(){
        println("Inside Update Name")
        status.value = "Nidhi Devi"
    }
}