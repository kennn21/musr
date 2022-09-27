package com.example.musr.data.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.example.musr.other.Constants.SONG_COLLECTION

class MusicDatabase {

    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)

    suspend fun getAllSongs(): List<Song> {
        return try{
            songCollection.get().await().toObjects(Song::class.java)
        }
    }
}