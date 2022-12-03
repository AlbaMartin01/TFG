package com.example.tfg

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1=findViewById<Button>(R.id.boton1)
        boton1.setOnClickListener {
            val intento1 = Intent(this, LogeoActivity::class.java)
            startActivity(intento1)
        }

        val boton2=findViewById<Button>(R.id.boton2)
        boton2.setOnClickListener {
            val intento2 = Intent(this, InsertarDatosLogeo::class.java)
            startActivity(intento2)
        }
    }
}