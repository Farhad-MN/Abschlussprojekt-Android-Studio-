package com.example.abschlussaufgabe.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.abschlussaufgabe.data.model.Picture

@Dao
interface PictureDao {

    //Die Methode zum Einfügen eines Elements in die 'appartment_table'
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPicture(pictureData: Picture)


    //Die Methode, die alle Daten aus der 'appartment_table' zurückliefert.
    @Query("SELECT * FROM picture_table")
    fun getAllPictures(): LiveData<List<Picture>>


    //Die Methode, um ein Item in der appartment_table zu aktualisieren.

    @Delete
    fun deletePicture(pictureData: Picture)

}

