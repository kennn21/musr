package com.example.musr

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.widget.RelativeLayout
import android.widget.Button
import android.view.View.OnClickListener
import android.widget.Toast


class MainActivity : AppCompatActivity() {
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


