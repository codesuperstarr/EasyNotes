package com.example.easynotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders

class NotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        val database = EasyNotesDatabase(this)
        val repository = NotesRepository(database)
        val factory = NotesViewModelFactory(repository)

        val viewModel = ViewModelProviders.of(this,  factory).get(NotesViewModel::class.java)
    }
}