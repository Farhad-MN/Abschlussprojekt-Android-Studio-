package com.example.abschlussaufgabe.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "appertment_table")

data class AppartmentData(

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var title: String,
    var addresse: String,
    var sleeproom: Int,
    var size:Int,
    var personas: Int,
    var pricePenNight: Int,
    var image: Int,
    var petsAllowed: Boolean

)
