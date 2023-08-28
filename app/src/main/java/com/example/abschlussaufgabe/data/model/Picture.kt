package com.example.abschlussaufgabe.data.model



import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "picture_table")
data class Picture(

    @PrimaryKey(autoGenerate = true)
    @Json(name = "id") val id: Long,
    @Json(name="common_name")val commonName: String = "",
    @Json(name="scientific_name")val scientificName: List<String>,
    @Json(name="other_name")val otherName: List<String>,
    @Json(name = "default_image")val defaultImage: DefaultImage? = DefaultImage("","",""),
) : Parcelable

