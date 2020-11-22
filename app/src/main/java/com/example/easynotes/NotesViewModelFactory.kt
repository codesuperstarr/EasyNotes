package com.example.easynotes

import androidx.lifecycle.ViewModelProvider

class NotesViewModelFactory(private val repository: NotesRepository): ViewModelProvider.NewInstanceFactory{
}