package com.example.abschlussaufgabe.data.db

import androidx.room.TypeConverter
import com.example.abschlussaufgabe.data.model.DefaultImage
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


class Converters {

    @TypeConverter
    fun fromList(value : List<String>) = Json.encodeToString(value)

    @TypeConverter
    fun toList(value: String) = Json.decodeFromString<List<String>>(value)

    @TypeConverter
    fun fromImage(value: DefaultImage)= Json.encodeToString(value)

    @TypeConverter
    fun toImage(value: String)= Json.decodeFromString<DefaultImage>(value)



}