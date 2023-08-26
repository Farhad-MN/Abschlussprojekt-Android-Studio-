package com.example.abschlussaufgabe.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.abschlussaufgabe.data.model.Favourite


@Dao
interface NaturDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(favourite: Favourite)


    @Query("SELECT * FROM favourite_table")
    suspend fun getAll(): LiveData<List<Favourite>>



    @Query("DELETE FROM favourite_table WHERE id = :id")
    suspend fun deleteById(id: Int)


}