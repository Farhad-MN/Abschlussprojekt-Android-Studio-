package com.example.abschlussaufgabe.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.abschlussaufgabe.data.AppRepository
import com.example.abschlussaufgabe.data.remote.NaturApi
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val repository = AppRepository(NaturApi)


    /*private val _loading = MutableLiveData<Boolean>(false)
    val loading: LiveData<Boolean>
        get() = _loading*/

    init {
       // loadNewImage()
        getResults()
    }
    /*fun loadNewImage() {
        viewModelScope.launch(Dispatchers.IO) {
            _loading.postValue(true)
            _loading.postValue(false)
        }
    }*/


    val pictures = repository.pictures

    val categories = repository.category

    val homeImages = repository.homeImages

    val detailsImages = repository.detailImages

    val settingsListes = repository.settingListes

    val profilImages = repository.profilImages

    fun getResults(){
        viewModelScope.launch {
            repository.getResults()
        }

    }






}