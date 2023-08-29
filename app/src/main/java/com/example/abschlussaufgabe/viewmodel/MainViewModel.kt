package com.example.abschlussaufgabe.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.abschlussaufgabe.data.AppRepository
import com.example.abschlussaufgabe.data.db.MyDatabase
import com.example.abschlussaufgabe.data.model.Picture
import com.example.abschlussaufgabe.data.remote.NaturApi
import kotlinx.coroutines.launch

class MainViewModel(application: Application): AndroidViewModel(application) {



    private val repository = AppRepository(NaturApi,MyDatabase.getDatabase(application))



    init {
        repository.getAllPicture()
        repository.getAllItem()
        repository.getCount()
        repository.prepopulateDB()
        getResults()

    }

    val appertment = repository.appertment

    val pictures = repository.picture

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
//Api DatenBank.
    fun insertPicture(picture: Picture){
        viewModelScope.launch{
            repository.insertPicture(picture)
        }
    }

    fun deletePicture(picture: Picture){
        viewModelScope.launch {
            repository.deletePicture(picture)
        }
    }

//Appertment DatenBank.









}