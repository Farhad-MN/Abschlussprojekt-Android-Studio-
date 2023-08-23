package com.example.abschlussaufgabe.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.data.model.Category
import com.example.abschlussaufgabe.data.model.ResultCategoryInner
import com.example.abschlussaufgabe.data.remote.CategoryApi
import java.lang.Exception

const val TAG = "AppRepository"

class AppRepository(private val api: CategoryApi) {







     var homeImages = mutableListOf<Int>()

    var detailImages = mutableListOf<Int>()

    var settingListes = mutableListOf<Int>()

    var profilImages = mutableListOf<Int>()

    var spinnerListes = mutableListOf<Int>()

    init {

        loadImages()
        loadSettings()
        loadProfil()

    }


    fun loadProfil(){
        profilImages = mutableListOf(
            R.drawable.recommend
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
    fun loadSettings(){
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
    suspend fun getCategories():List<ResultCategoryInner>{
        return try {
            api.retrofitService.getCategories().category
        } catch (e:Exception){
            Log.e(TAG, "Error loading Data from API: $e")
            emptyList()
        }

    }

}