package com.example.abschlussaufgabe.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.data.AppRepository
import com.example.abschlussaufgabe.data.TAG
import com.example.abschlussaufgabe.data.model.Category
import com.example.abschlussaufgabe.data.model.ResultCategoryInner
import com.example.abschlussaufgabe.data.remote.CategoryApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

const val TAG = "MainViewModel"

class MainViewModel: ViewModel() {

    private val repository = AppRepository(CategoryApi)


    private val _loading = MutableLiveData<Boolean>(false)
    val loading: LiveData<Boolean>
        get() = _loading

    private val _categories = MutableLiveData<List<ResultCategoryInner>>()
    val categories: LiveData<List<ResultCategoryInner>>
        get() = _categories

    val homeImages = repository.homeImages

    val detailsImages = repository.detailImages

    val settingsListes = repository.settingListes

    init {
        loadNewImage()

    }

    fun loadNewImage() {
        viewModelScope.launch(Dispatchers.IO) {
            _loading.postValue(true)
            _loading.postValue(false)
        }
    }
    fun loadCategories(){
        viewModelScope.launch {
            _categories.value = repository.getCategories()
            Log.e(TAG,"${categories.value}")
        }
    }
















}