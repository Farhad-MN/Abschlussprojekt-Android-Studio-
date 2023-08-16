package com.example.abschlussaufgabe.data.remote

import com.example.abschlussaufgabe.data.model.ResultCategory
import com.example.abschlussaufgabe.data.model.ResultCategoryInner
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


const val BASE_URL = "https://outdooractive.com/api/project/api-dev-oa/"


private val moshi: Moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit: Retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi).asLenient())
    .baseUrl(BASE_URL)
    .build()

interface ApiService {

    @GET("category/tree")
    suspend fun getCategories(): ResultCategory

}
object CategoryApi{
    val retrofitService:ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}