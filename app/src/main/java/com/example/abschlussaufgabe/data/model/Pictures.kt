package com.example.abschlussaufgabe.data.model



import com.squareup.moshi.Json


data class Pictures(

    @Json(name = "id") val id: Long,
    @Json(name="common_name")val commonName: String = "",
    @Json(name="scientific_name")val scientificName: List<String>,
    @Json(name="other_name")val otherName: List<String>,
    @Json(name = "default_image")val defaultImage: DefaultImage? = DefaultImage("","",""),

)
