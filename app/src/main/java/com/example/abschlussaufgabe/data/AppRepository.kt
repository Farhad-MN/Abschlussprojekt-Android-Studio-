package com.example.abschlussaufgabe.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.data.model.Category
import com.example.abschlussaufgabe.data.model.Pictures
import com.example.abschlussaufgabe.data.remote.NaturApi

class AppRepository(private val api: NaturApi) {




    private val _pictures = MutableLiveData<List<Pictures>>()
    val pictures: LiveData<List<Pictures>>
        get() = _pictures




    private val _category = MutableLiveData<List<Category>>()
    val category: LiveData<List<Category>>
        get() = _category

    var homeImages = mutableListOf<Int>()

    var detailImages = mutableListOf<Int>()

    var settingListes = mutableListOf<Int>()

    var profilImages = mutableListOf<Int>()

    init {

        loadCategory()
        loadImages()
        loadSettings()
        loadDetail()
        loadProfil()
    }


    fun loadProfil() {
        profilImages = mutableListOf(
            R.drawable.recommend
        )
    }

    fun loadDetail() {

        detailImages = mutableListOf(
            R.drawable.tour_route,
            R.drawable.tour_route,
            R.drawable.tour_route,
            R.drawable.tour_route,
            R.drawable.tour_route,
            R.drawable.tour_route,
            R.drawable.tour_route,
            R.drawable.tour_route,
            R.drawable.tour_route,
        )
    }

    fun loadCategory() {
        _category.value = listOf(

            Category(1, R.string.category_01, R.drawable.mtb_01),
            Category(2, R.string.category_02, R.drawable.wandern_02),
            Category(3, R.string.category_03, R.drawable.fahrrad_03),
            Category(4, R.string.category_04, R.drawable.bikepacking_04),
            Category(5, R.string.category_05, R.drawable.rennrad_05),
            Category(6, R.string.category_06, R.drawable.laufen_06)
        )
    }

    fun loadImages() {
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

    fun loadSettings() {
        settingListes = mutableListOf(

            R.string.setting_01,
            R.string.setting_02,
            R.string.setting_03,
            R.string.setting_04,
            R.string.setting_05,
            R.string.setting_06,
            R.string.setting_07,
            R.string.setting_08,
            R.string.setting_09,
            R.string.setting_10,
            R.string.setting_11,
            R.string.setting_12,
            R.string.setting_13,
            R.string.setting_14,

            )
    }

    suspend fun getResults() {
        try {
            _pictures.value = NaturApi.retrofitService.getResults().data
        } catch (e: Exception) {
            Log.e("AppRepository", "${e}")
        }
    }




}