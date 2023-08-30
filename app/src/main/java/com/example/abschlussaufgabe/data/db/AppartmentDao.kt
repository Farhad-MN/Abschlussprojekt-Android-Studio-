package com.example.abschlussaufgabe.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update


//Interface, das die Methoden der Datenbank bereitstellt.
@Dao
interface AppartmentDao {

    //Die Methode zum Einfügen eines Elements in die 'appartment_table'
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertItem(ItemData: AppartmentData)


    //Die Methode, die alle Daten aus der 'appartment_table' zurückliefert.
    @Query("SELECT * FROM appertment_table")
    suspend fun getAllItem(): List<AppartmentData>


    //Die Methode, um sich die Anzahl der Elemente in der appartment_table ausgeben zu lassen.

    @Query("SELECT COUNT(*) FROM appertment_table")
    fun getCount(): Int

    //Die Methode, um ein Item in der appartment_table zu aktualisieren.

    @Update
    fun updateItem(itemData: AppartmentData)

    @Delete
    fun deleteItem(itemData: AppartmentData)


}