package com.example.easynotes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Fts4
import androidx.room.PrimaryKey

@Fts4
@Entity(tableName = "NotesDatabase")
data class NotesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "title")
    var title: String?,
    @ColumnInfo(name = "textBody")
    var text: String
) {
}