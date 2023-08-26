package com.example.abschlussaufgabe.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.abschlussaufgabe.data.model.Favourite

@Database(entities = [Favourite::class], version = 1)
abstract class NaturDatabase: RoomDatabase() {

    abstract val naturlDao: NaturDao

    companion object {

        private lateinit var INSTANCE: NaturDatabase

        fun getDatabase(context: Context): NaturDatabase {
            synchronized(NaturDatabase::class.java) {

                if (!::INSTANCE.isInitialized) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        NaturDatabase::class.java,
                        "favourite_table"

                    ).build()
                }
                return INSTANCE
            }
        }

    }

}