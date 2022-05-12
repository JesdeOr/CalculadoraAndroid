package com.example.examenentornos

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonSuma = findViewById<Button>(R.id.buttonSuma)
        var buttonResta = findViewById<Button>(R.id.buttonResta)
        var buttonProducto = findViewById<Button>(R.id.buttonProducto)
        var buttonDivision = findViewById<Button>(R.id.buttonDivision)
        var buttonRaiz = findViewById<Button>(R.id.buttonRaiz)
        var buttonCuadrado = findViewById<Button>(R.id.buttonCuadrado)
        var buttonMOD = findViewById<Button>(R.id.buttonMOD)
        var buttonDEL = findViewById<Button>(R.id.buttonDEL)
        var buttonIgual = findViewById<Button>(R.id.buttonIgual)

        var operando = findViewById<TextView>(R.id.operando)
        var esperado = findViewById<EditText>(R.id.esperado)
        var resultado = findViewById<TextView>(R.id.resultado)

        var numero1 = findViewById<EditText>(R.id.numero1)
        var numero2 = findViewById<EditText>(R.id.numero2)

        var operacion = ""


        buttonSuma.setOnClickListener{
            esperado.setBackgroundColor(Color.TRANSPARENT)
            operando.setText("+")
            operacion = "suma"
        }
        buttonResta.setOnClickListener{
            esperado.setBackgroundColor(Color.TRANSPARENT)
            operando.setText("-")
            operacion = "resta"
        }
        buttonProducto.setOnClickListener {
            esperado.setBackgroundColor(Color.TRANSPARENT)
            operando.setText("*")
            operacion = "producto"
        }
        buttonDivision.setOnClickListener {
            esperado.setBackgroundColor(Color.TRANSPARENT)
            operando.setText("/")
            operacion = "division"
        }
        buttonRaiz.setOnClickListener {
            esperado.setBackgroundColor(Color.TRANSPARENT)
            operando.setText("√")
            numero2.setText("")
            operacion = "sqrt"
        }
        buttonCuadrado.setOnClickListener {
            esperado.setBackgroundColor(Color.TRANSPARENT)
            operando.setText("x²")
            numero2.setText("")
            operacion = "sq"
        }
        buttonMOD.setOnClickListener {
            esperado.setBackgroundColor(Color.TRANSPARENT)
            operando.setText("MOD")
            operacion = "mod"
        }
        buttonDEL.setOnClickListener {
            esperado.setBackgroundColor(Color.TRANSPARENT)
            numero1.setText("")
            numero2.setText("")
            esperado.setText("")
            operando.setText("")
            resultado.setText("")
        }
        buttonIgual.setOnClickListener {
            var num1int = (numero1.getText().toString()).toDouble()
            when(operacion){
                "suma" -> {

                    var num2int = (numero2.getText().toString()).toDouble()

                    resultado.setText((num1int + num2int).toString())
                    if (esperado.getText().toString().toDouble() == resultado.getText().toString().toDouble()){
                        esperado.setBackgroundColor(Color.GREEN)
                    } else{
                        esperado.setBackgroundColor(Color.RED)
                    }
                }
                "resta" -> {
                    var num2int = (numero2.getText().toString()).toDouble()
                    resultado.setText((num1int - num2int).toString())
                    if (esperado.getText().toString().toDouble() == resultado.getText().toString().toDouble()){
                        esperado.setBackgroundColor(Color.GREEN)
                    } else{
                        esperado.setBackgroundColor(Color.RED)
                    }
                }
                "producto" ->
                {
                    var num2int = (numero2.getText().toString()).toDouble()
                    resultado.setText((num1int * num2int).toString())
                    if (esperado.getText().toString().toDouble() == resultado.getText().toString().toDouble()){
                        esperado.setBackgroundColor(Color.GREEN)
                    } else{
                        esperado.setBackgroundColor(Color.RED)
                    }
                }
                "division" -> {
                    var num2int = (numero2.getText().toString()).toDouble()
                    resultado.setText((num1int / num2int).toString())
                    if (esperado.getText().toString().toDouble() == resultado.getText().toString().toDouble()){
                        esperado.setBackgroundColor(Color.GREEN)
                    } else{
                        esperado.setBackgroundColor(Color.RED)
                    }
                }
                "sq" -> {
                    resultado.setText((num1int * num1int).toString())
                    if (esperado.getText().toString().toDouble() == resultado.getText().toString().toDouble()){
                        esperado.setBackgroundColor(Color.GREEN)
                    } else{
                        esperado.setBackgroundColor(Color.RED)
                    }
                }
                "sqrt" -> {
                    resultado.setText((sqrt(num1int)).toString())
                    if (esperado.getText().toString().toDouble() == resultado.getText().toString().toDouble()){
                        esperado.setBackgroundColor(Color.GREEN)
                    } else{
                        esperado.setBackgroundColor(Color.RED)
                    }
                }
            }
        }

    }
}