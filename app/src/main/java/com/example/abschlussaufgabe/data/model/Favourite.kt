package com.example.abschlussaufgabe.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favourite_table")
data class Favourite(

    @PrimaryKey
    val id:Int,
    val scientificName:String,
    val otherName:String,
    val mediumUrl: String,

)
