package com.example.abschlussaufgabe.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.abschlussaufgabe.data.AppRepository
import com.example.abschlussaufgabe.data.remote.NaturApi
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val repository = AppRepository(NaturApi)

    init {
       // loadNewImage()
        getResults()
    }

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