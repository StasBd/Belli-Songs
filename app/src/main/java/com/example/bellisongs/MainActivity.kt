package com.example.bellisongs

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.media.MediaPlayer
import android.provider.MediaStore.Audio.Media
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var mMediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val schoolbell = findViewById<ImageView>(R.id.schoolbell)
            schoolbell.setOnClickListener() {
            }





    }
}