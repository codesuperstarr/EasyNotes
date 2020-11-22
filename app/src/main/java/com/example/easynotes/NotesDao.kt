package com.example.easynotes

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NotesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNewNotes(note:NotesEntity)

    @Update
   suspend fun updateNotes(note: NotesEntity)

    @Delete
   suspend fun deleteNotes(note: NotesEntity)

    @Query("SELECT * FROM NotesDatabase")
    suspend fun getAllNotes(note: NotesEntity): LiveData<List<NotesEntity>>

}