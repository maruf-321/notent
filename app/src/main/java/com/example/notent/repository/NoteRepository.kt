package com.example.notent.repository

import com.example.notent.database.NoteDatabase
import com.example.notent.model.Note

class NoteRepository(private val  db: NoteDatabase) {

    suspend fun insertNote(note: Note) = db.getNoteDao().insetNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().insetNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().insetNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?) = db.getNoteDao().searchNotes(query)
}