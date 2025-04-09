package com.example.prova

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.prova.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonCalc.setOnClickListener {
            val farenheit: Float = binding.editFar.text.toString().trim().toFloatOrNull() ?: 0f

            val celsius: Float = (farenheit - 32) * 5 / 9
            val kelvin: Float = (farenheit - 32) * 5 / 9 + 273.15f

            binding.viewCelsiusTemp.text = "%.2f°C".format(celsius)
            binding.viewKelvin1.text = "%.2f K".format(kelvin)



        }

    }
}