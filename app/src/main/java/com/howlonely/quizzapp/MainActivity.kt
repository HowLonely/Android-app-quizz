package com.howlonely.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.howlonely.quizzapp.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    /*ROJO : #DA291C
      Naranjo amarillo: #DA291C
      White, black
      Verde soft: #3D9970
      Gris soft: #6C7A89 */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnStart = binding.btnStart

        val score = intent.getIntExtra("score", 0)

        Log.d("score", score.toString())
        binding.tvLatestscore.text = "Ultima Puntuación: ${score}"


        btnStart.setOnClickListener {
            val intent = Intent(this, QuizzActivity::class.java)
            startActivity(intent)
        }
    }



}