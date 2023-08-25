package com.example.abschlussaufgabe.data.remote

import com.example.abschlussaufgabe.data.model.Natur
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


//TODO APISERVICE LINKE:
const val BASE_URL = "https://perenual.com/api/"
const val API_TOKEN = "sk-Sd7u64e3219ac4c461939"



// Moshi konvertiert Serverantworten in Kotlin Objekte

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

// Retrofit übernimmt die Kommunikation und übersetzt die Antwort

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

// Das Interface bestimmt, wie mit dem Server kommuniziert wird

interface ApiService {

//Diese Funktion spezifiziert die URL und holt die Liste an Informationen

    //https://perenual.com/api/species-list?page=1&key=sk-Sd7u64e3219ac4c461939

    @GET("species-list?key=sk-Sd7u64e3219ac4c461939")
    suspend fun getResults():Natur

    /*@GET("species-list?key=sk-Sd7u64e3219ac4c461939")
    suspend fun getSearch(@Query("q=monstera")category:String):Natur*/

}
object NaturApi {
    val retrofitService: ApiService by lazy { retrofit.create(ApiService::class.java) }
}