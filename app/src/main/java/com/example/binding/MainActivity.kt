package com.example.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNoche.setOnClickListener {
            Toast.makeText(this, "Buenas noches..", Toast.LENGTH_SHORT).show()
            binding.texto.setText("Good morning")
        }

        binding.btnDia.setOnClickListener {
            Toast.makeText(this, "Buen dia...", Toast.LENGTH_SHORT).show()
            binding.texto.setText("Good night")
        }

    }
}