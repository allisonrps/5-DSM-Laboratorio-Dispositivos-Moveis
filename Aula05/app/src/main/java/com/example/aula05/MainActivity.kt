package com.example.aula05

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val num1 = findViewById(R.id.edit_ent1) as EditText
            val num2 = findViewById(R.id.edit_ent2) as EditText
            val soma = findViewById(R.id.edit_soma) as TextView
            val subtrai = findViewById(R.id.edit_subtrai) as TextView
            val multiplica = findViewById(R.id.edit_multiplica) as TextView
            val divide = findViewById(R.id.edit_divide) as TextView
            val bt1 = findViewById(R.id.bt1) as Button

        bt1.setOnClickListener{
            val val1 = num1.text.toString().toFloat();
            val val2 = num1.text.toString().toFloat();
            val total_soma = val1 + val2
            val total_subtrai = val1 - val2
            val total_multiplica = val1 * val2
            val total_divide = val1 / val2

            soma.setText(total_soma.toString())
            subtrai.setText(total_subtrai.toString())
            divide.setText(total_divide.toString())
            multiplica.setText(total_multiplica.toString())

        }
    }
}
