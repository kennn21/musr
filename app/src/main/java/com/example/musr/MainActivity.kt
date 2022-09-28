package com.example.musr

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.RequestManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var glide: RequestManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val songClick = findViewById<RelativeLayout>(R.id.song_item)
        songClick.setOnClickListener{
            Toast.makeText(this, "Song Activity",Toast.LENGTH_SHORT).show()
            var Intent = Intent(this, SongActivity::class.java)
            startActivity(Intent)
        }
    }
}


