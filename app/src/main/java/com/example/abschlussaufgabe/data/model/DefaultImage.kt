package com.example.abschlussaufgabe.data.model



import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class DefaultImage(

    @Json(name="regular_url")val regularURL: String,
    @Json(name="medium_url")val mediumURL: String,
    @Json(name="small_url")val smallURL: String,

): Parcelable
