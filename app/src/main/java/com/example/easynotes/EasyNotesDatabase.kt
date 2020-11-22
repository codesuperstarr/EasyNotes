package com.example.easynotes

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [NotesEntity::class], version = 1 )
abstract class EasyNotesDatabase: RoomDatabase() {

    abstract fun getNotesDao(): NotesDao

    companion object{

        @Volatile
        private var instance: EasyNotesDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance?: synchronized(LOCK){
            instance?: createNotesDatabase(context).also { instance = it }
        }

        private fun createNotesDatabase(context: Context) = Room.databaseBuilder(context.applicationContext,
            EasyNotesDatabase::class.java, "EasyNotesDb.db" ).build()

    }

}