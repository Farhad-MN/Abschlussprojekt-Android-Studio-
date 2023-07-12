package com.example.abschlussaufgabe.data


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.data.model.Category

class AppRepository {

    private val _category = MutableLiveData<List<Category>>()
    val category: LiveData<List<Category>>
        get() = _category

    init {
        loadCategory()
    }

    fun loadCategory(){
        _category.value = listOf(

            Category(1, R.drawable.mtb_01,R.string.category_01),
            Category(2, R.drawable.wandern_02,R.string.category_02),
            Category(3, R.drawable.fahrrad_03,R.string.category_02),
            Category(4, R.drawable.bikepacking_04,R.string.category_04),
            Category(5, R.drawable.rennrad_05,R.string.category_05),
            Category(6, R.drawable.laufen_06,R.string.category_06)
        )
    }

}