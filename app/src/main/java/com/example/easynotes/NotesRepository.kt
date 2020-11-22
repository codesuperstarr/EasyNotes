package com.example.easynotes

class NotesRepository(private val db: EasyNotesDatabase) {

    suspend fun insertNewNotes(note:NotesEntity) = db.getNotesDao().insertNewNotes(note)

    suspend fun updateNotes(note: NotesEntity) = db.getNotesDao().updateNotes(note)

    suspend fun deleteNotes(note: NotesEntity) = db.getNotesDao().deleteNotes(note)

    suspend fun getAllNotes(note: NotesEntity) = db.getNotesDao().getAllNotes(note)
}

  /*  @WorkerThread
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
}*/