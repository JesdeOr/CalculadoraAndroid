package com.example.examenentornos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var button4 = findViewById<Button>(R.id.button4)

        var button5 = findViewById<Button>(R.id.button5)

        button4.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        button5.setOnClickListener{
            startActivity(Intent(this,MainActivity3::class.java))
        }
    }
}