package com.example.abschlussaufgabe.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.abschlussaufgabe.data.AppRepository
import com.example.abschlussaufgabe.data.remote.NaturApi
import kotlinx.coroutines.launch

class MainViewModel(application: Application): AndroidViewModel(application) {

    private val repository = AppRepository(NaturApi)

    //val favouritetListe = repository.favouritetListe


    init {

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