package com.example.proyecto007reto5f2023

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val imageButton: ImageButton by lazy {
        findViewById<ImageButton>(R.id.imageButton)
    }

    private val animales = listOf(
        R.drawable.gato,
        R.drawable.perro,
        R.drawable.elefante
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton.setOnClickListener {
            val indice = animales.random()
            imageButton.setImageResource(indice)
        }
    }
}