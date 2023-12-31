package com.example.abschlussaufgabe.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.abschlussaufgabe.data.AppRepository
import com.example.abschlussaufgabe.data.db.AppartmentData
import com.example.abschlussaufgabe.data.db.MyDatabase
import com.example.abschlussaufgabe.data.model.Picture
import com.example.abschlussaufgabe.data.remote.NaturApi
import kotlinx.coroutines.launch

class MainViewModel(application: Application): AndroidViewModel(application) {

    // hier wird eine AppRepository Instanz erstellt, mit dem Parameter (Api & Datenbank)

    private val repository = AppRepository(NaturApi,MyDatabase.getDatabase(application))

    var savedPictures = repository.savedPictures

//Liste aller Appartments die im RecyclerView abgebildet werden
    val appartmentsLiveData = MutableLiveData<List<AppartmentData>>()

    init {
        repository.getCount()
        repository.prepopulateDB()
        loadFromDatabase()
        getResults()
    }

    // hier werden die Daten aus dem repository in einer eigenen Variablen gespeichert

    val pictures = repository.picture

    val categories = repository.category

    val homeImages = repository.homeImages

    val detailsImages = repository.detailImages

    val settingsListes = repository.settingListes

    val profilImages = repository.profilImages


    /*---------------------- Api DatenBank ------------------------------*/

    //Diese Funktion ruft die Repository-Funktion zum Laden.

    fun getResults(){
        viewModelScope.launch {
            repository.getResults()
        }
    }

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

    /*---------------------- Appertment DatenBank ------------------------------*/

    //Diese Funktion ruft die Repository-Funktion zum Laden.

    fun insertItem(ItemData: AppartmentData){
        viewModelScope.launch {
            repository.insertItem(ItemData)
        }
    }


    fun loadFromDatabase() {
        viewModelScope.launch {
            appartmentsLiveData.value = repository.getAllItem()
        }
    }

    fun deleteItem(ItemData: AppartmentData){
        viewModelScope.launch {
            repository.deleteItem(ItemData)
        }
    }


}