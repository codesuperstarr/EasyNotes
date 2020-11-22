package com.example.easynotes

import androidx.annotation.WorkerThread

class NotesRepository(private val notesDao: NotesDao) {

    @WorkerThread
    suspend fun insertNewNotes(note:NotesEntity){
        notesDao.insertNewNotes(note)
}

    @WorkerThread
    suspend fun updateNotes(note: NotesEntity){
        notesDao.updateNotes(note)
    }

    @WorkerThread
    suspend fun deleteNotes(note: NotesEntity){
        notesDao.deleteNotes(note)
    }

    @WorkerThread
    suspend fun getAllNotes(note:NotesEntity){
        notesDao.getAllNotes(note)

    }
}