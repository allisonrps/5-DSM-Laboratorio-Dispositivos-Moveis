package com.example.calculadoracombustivel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadoracombustivel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val rendimento = 12.0 // 12 km por litro

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializa o ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Acessando os componentes diretamente via binding
        binding.btnCalcular.setOnClickListener {
            val tempo = binding.editTempo.text.toString().toDoubleOrNull()
            val velocidade = binding.editVelocidade.text.toString().toDoubleOrNull()

            if (tempo != null && velocidade != null) {
                val distancia = tempo * velocidade
                val litros = distancia / rendimento

                val resultado = """
                    Distância percorrida: %.2f km
                    Combustível gasto: %.2f litros
                """.trimIndent().format(distancia, litros)

                binding.textResultado.text = resultado
            } else {
                binding.textResultado.text = "Por favor, preencha os dois campos corretamente."
            }
        }
    }
}
