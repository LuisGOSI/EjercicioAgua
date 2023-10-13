package com.example.ejercicioagua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {

    private lateinit var tvResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        tvResultado = findViewById(R.id.tvResultado)

        val resultado = intent.getStringExtra("resultado")
        tvResultado.text="El total a pagar es: $resultado"

    }
}