package com.dam2a.ejcorrutina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val miBoton: Button = findViewById(R.id.boton)
        miBoton.setOnClickListener {
            lanzarCorrutina()
        }

    }

    private fun lanzarCorrutina() {
        val miTexto: TextView = findViewById(R.id.miTextView)
        //Launch se encarga de crear una corrutina
        // vamos a poder identificarla con 'job'
        val job = GlobalScope.launch(Dispatchers.Main) {
            // llamamos a una funcion que estara dentro de la corrutina
            // en esta funcion habrá un delay()
            suspendingTask(miTexto)
        }
    }

    suspend fun suspendingTask(miTexto: TextView) {
        miTexto.text = "Hola"
        delay(3000L)
        miTexto.text="Corrutine!"
    }
}