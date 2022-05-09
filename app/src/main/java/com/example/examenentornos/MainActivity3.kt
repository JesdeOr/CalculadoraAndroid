package com.example.examenentornos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var button6 = findViewById<Button>(R.id.button6)

        var button7 = findViewById<Button>(R.id.button7)

        button6.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
        button7.setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}