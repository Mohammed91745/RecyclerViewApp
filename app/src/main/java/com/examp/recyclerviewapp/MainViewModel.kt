package com.examp.recyclerviewapp
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val dataList = DataProvider.getRandomData()

    fun getRandomizedData() = dataList
}
