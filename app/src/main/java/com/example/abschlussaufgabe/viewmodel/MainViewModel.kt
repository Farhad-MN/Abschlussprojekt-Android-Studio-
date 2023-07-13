package com.example.abschlussaufgabe.viewmodel

import androidx.lifecycle.ViewModel
import com.example.abschlussaufgabe.data.AppRepository

class MainViewModel: ViewModel() {

    private val repository = AppRepository()

    val categories = repository.category
    val homeImages = repository.homeImages

}