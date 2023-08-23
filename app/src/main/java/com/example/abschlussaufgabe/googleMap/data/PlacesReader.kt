
package com.example.abschlussaufgabe.googleMap.data

import android.content.Context
import com.example.abschlussaufgabe.R
import com.google.codelabs.buildyourfirstmap.place.PlaceResponse
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import java.io.InputStream
import java.io.InputStreamReader


class PlacesReader(private val context: Context) {

    //private val gson = Gson()

    private val inputStream: InputStream
        get() = context.resources.openRawResource(R.raw.places)

    /*fun read(): List<Place> {
        val itemType = object : TypeToken<List<PlaceResponse>>() {}.type
        val reader = InputStreamReader(inputStream)
        return gson.fromJson<List<PlaceResponse>>(reader, itemType).map {
            it.toPlace()
        }
    }*/
}

