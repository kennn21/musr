package com.example.musr.exoplayer.callbacks

import android.support.v4.media.MediaMetadataCompat
import com.example.musr.exoplayer.FirebaseMusicSource

class MusicPlaybackPreparer (
    private val firebaseMusicSource: FirebaseMusicSource,
    private val playerPrepared: (MediaMetadataCompat?) -> Unit
        ){
}