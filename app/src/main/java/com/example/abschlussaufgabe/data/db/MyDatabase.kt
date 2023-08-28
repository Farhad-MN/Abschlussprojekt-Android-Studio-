package com.example.abschlussaufgabe.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.abschlussaufgabe.data.model.Picture

@Database(entities = [AppartmentData::class, Picture::class], version = 1)
@TypeConverters(Converters::class)
abstract class MyDatabase : RoomDatabase() {

    //Variable für das Interface aus der AppartmentDao
    abstract val appartmentDao: AppartmentDao
    abstract val pictureDao: PictureDao


//Speichert die Instance der AppartmentDatabase um mit dieser arbeiten zu können

   companion object{

       @Volatile
       private lateinit var INSTANCE: MyDatabase
       fun getDatabase(context: Context): MyDatabase {
           synchronized(MyDatabase::class.java) {
               if (!::INSTANCE.isInitialized) {
                   INSTANCE = Room.databaseBuilder(
                       context.applicationContext,
                       MyDatabase::class.java,
                       "my_database"
                   )
                       .allowMainThreadQueries().build()
               }
           }
           return INSTANCE
       }
   }
}