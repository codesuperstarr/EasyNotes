package com.example.easynotes

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [NotesEntity::class], version = 1 )
abstract class EasyNotesDatabase: RoomDatabase() {

    abstract fun getNotesDao(): NotesDao

    companion object{

    }

    private fun createNotesDatabase(context: Context) = Room.databaseBuilder(context.applicationContext,
        EasyNotesDatabase::class.java, "EasyNotesDb.db" ).build()

}