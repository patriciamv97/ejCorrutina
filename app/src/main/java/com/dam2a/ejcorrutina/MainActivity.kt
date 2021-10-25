package com.dam2a.ejcorrutina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val miBoton : Button = findViewById(R.id.boton)
        miBoton.setOnClickListener{
            lanzarCorrutina()
        }

    }
    private fun lanzarCorrutina(){

    }
}