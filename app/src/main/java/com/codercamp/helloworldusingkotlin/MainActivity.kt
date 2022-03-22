package com.codercamp.helloworldusingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.Roller);
        tv = findViewById(R.id.text)
        btn.setOnClickListener{ rollDice() }
    }

    private fun rollDice() {
        val roll = (1..10).random()
        tv.text = roll.toString()
    }
}