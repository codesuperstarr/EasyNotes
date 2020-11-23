package com.example.easynotes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.notes_item_layout.view.*

class NotesRecyclerAdapter(var notes: List<NotesEntity>,
private val viewModel: NotesViewModel): RecyclerView.Adapter<NotesRecyclerAdapter.NotesViewHolder>(){

    inner class NotesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.notes_item_layout, parent, false)
        return NotesViewHolder(view)
    }

    override fun getItemCount(): Int {
       return notes.size
    }

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        val curNoteItem = notes[position]

    }
}