package com.example.easynotes

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NotesViewModel(private val repository: NotesRepository): ViewModel(){

    fun insertNewNotes(note: NotesEntity) = CoroutineScope(Dispatchers.Main).launch {
        repository.insertNewNotes(note)
    }

    fun updateNotes(note: NotesEntity) = CoroutineScope(Dispatchers.Main).launch {
        repository.updateNotes(note)
    }

    fun deleteNotes(note: NotesEntity) = CoroutineScope(Dispatchers.Main).launch {
        repository.deleteNotes(note)
    }

    fun getAllNotes(note: NotesEntity) = CoroutineScope(Dispatchers.Main).launch {
        repository.getAllNotes(note)
    }
}