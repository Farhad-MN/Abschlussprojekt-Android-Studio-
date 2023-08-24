package com.example.abschlussaufgabe.data.model

import com.squareup.moshi.Json

data class DefaultImage(
    @Json(name="regular_url")val regularURL: String,
    @Json(name="medium_url")val mediumURL: String,
    @Json(name="small_url")val smallURL: String,
)
