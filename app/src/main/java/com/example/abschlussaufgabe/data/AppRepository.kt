package com.example.abschlussaufgabe.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.data.model.Category
import kotlinx.coroutines.delay

class AppRepository {

    private val _category = MutableLiveData<List<Category>>()
    val category: LiveData<List<Category>>
        get() = _category

     var homeImages = mutableListOf<Int>()

    //var einstellungList = mutableListOf<String>()




    init {
        loadCategory()
        loadImages()
        //loadEinstellung()
    }

    fun loadCategory(){
        _category.value = listOf(

            Category(1, R.string.category_01,R.drawable.mtb_01),
            Category(2, R.string.category_02,R.drawable.wandern_02),
            Category(3, R.string.category_03,R.drawable.fahrrad_03),
            Category(4, R.string.category_04,R.drawable.bikepacking_04),
            Category(5, R.string.category_05,R.drawable.rennrad_05),
            Category(6, R.string.category_06,R.drawable.laufen_06)
        )
    }
    fun loadImages(){
        homeImages = mutableListOf(
            R.drawable.rv_bild_01,
            R.drawable.rv_bild_02,
            R.drawable.rv_bild_03,
            R.drawable.rv_bild_04,
            R.drawable.rv_bild_05,
            R.drawable.rv_bild_06,
            R.drawable.rv_bild_07,
            R.drawable.rv_bild_08,
            R.drawable.rv_bild_09,
            R.drawable.rv_bild_10,
            R.drawable.rv_bild_11,
        )
    }
    /*fun loadEinstellung(){
        einstellungList = mutableListOf(
            "Account",
            "Mitteilungen          ->",
            "Profil-Info           ->",
            "Privatsphäre          ->",
            "App-Einstellungen     ->",
            "Live-Tracking         ->"
        )
    }*/

}