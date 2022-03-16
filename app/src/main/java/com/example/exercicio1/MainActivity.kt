package com.example.exercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val totalCompra = findViewById<Button>(R.id.totalCompra)
        val arroz = findViewById<CheckBox>(R.id.checkBox)
        val leite = findViewById<CheckBox>(R.id.checkBox2)
        val carne = findViewById<CheckBox>(R.id.checkBox3)
        val feijao = findViewById<CheckBox>(R.id.checkBox4)
        val refrigerante = findViewById<CheckBox>(R.id.checkBox5)
        totalCompra.setOnClickListener{
            var total = 0.0
            if (arroz.isChecked){
                total += 2.69
            }
            if (leite.isChecked){
                total += 5
            }
            if (carne.isChecked){
                total += 10
            }
            if (feijao.isChecked){
                total += 3.38
            }
            if (refrigerante.isChecked){
                total += 3
            }
            totalCompra.text = "R$ %.2f".format(total)
        }
    }
}