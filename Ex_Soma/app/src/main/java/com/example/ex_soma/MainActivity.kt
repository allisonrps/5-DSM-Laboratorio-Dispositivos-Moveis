package com.example.ex_soma

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.ex_soma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonSomar.setOnClickListener {

            val numero01 = binding.numero01.text.toString()
            val numero02 = binding.numero02.text.toString()

            if (numero01.isEmpty() || numero02.isEmpty()) {
                binding.resultado.text = "FAVOR INSERIR OS VALORES"
            } else {
                val soma = numero01.toDouble() + numero02.toDouble()
                binding.resultado.text = "$numero01 + $numero02 = $soma"
            }
        }
    }
}
