package com.example.framelayout2claudia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagenFondo = findViewById<ImageView>(R.id.imagen_background)
        val imagenCentral = findViewById<ImageView>(R.id.imagen_estadistica)

        imagenFondo.setOnClickListener {
            val intent = Intent(this, ActivityLeopardo::class.java)
            startActivity(intent)
        }

        imagenCentral.setOnClickListener {
            val intent = Intent(this, ActivityCocodrilo::class.java)
            startActivity(intent)
        }
    }
}