package com.example.holamundo_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Conectamos la vista del texto con la clase, asignándola a una variable
        val helloText = findViewById<TextView>(R.id.hello_text)

        //Editamos el contenido del texto por medio del método text
        helloText.text = "Bienvenido, es hora de aprender!"

    }
}