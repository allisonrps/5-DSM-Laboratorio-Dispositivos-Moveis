package com.example.aula02

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.aula02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {

            val nome = binding.editNome.text.toString().trim()
            val snome = binding.editSobrenome.text.toString().trim()

            if (nome.isEmpty() || snome.isEmpty()) {
                //binding.textResultado.text = " Nome não encontrado "
                Toast.makeText(applicationContext, "Nome não inserido", Toast.LENGTH_SHORT).show()
            } else {
                //binding.textResultado.text = " Ola " + nome + " " + snome
                Toast.makeText(applicationContext, "Olá $nome $snome", Toast.LENGTH_LONG).show()

            }
        }
    }
}