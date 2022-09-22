package com.example.musr
import android.net.Uri.*
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class SongActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_song)
        val videoView = findViewById<VideoView>(R.id.video_sample)
        val uri = parse("android.resource://com.example.musr/raw/videosample.mp4")
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}