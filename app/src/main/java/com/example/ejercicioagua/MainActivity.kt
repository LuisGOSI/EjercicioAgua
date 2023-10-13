package com.example.ejercicioagua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var etLitros: EditText
    private lateinit var btnEnviar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etLitros = findViewById(R.id.etLitros)
        btnEnviar = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val intent = Intent(this@MainActivity, ResultadoActivity::class.java)

            val litrosConsumidos = etLitros.text.toString().toInt()

            val cuotaFija = 50.0
            val resultado = when {
                litrosConsumidos <= 50 -> cuotaFija
                litrosConsumidos <= 200 -> cuotaFija + (litrosConsumidos - 50) * 1.5
                else -> cuotaFija + 150 + (litrosConsumidos - 200) * 3.5
            }

            intent.putExtra("resultado", resultado.toString())
            startActivity(intent)
        }
    }
}

