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
            operando.setText("+")
            operacion = "suma"
        }
        buttonResta.setOnClickListener{
            operando.setText("-")
            operacion = "resta"
        }
        buttonProducto.setOnClickListener {
            operando.setText("*")
            operacion = "producto"
        }
        buttonDivision.setOnClickListener {
            operando.setText("/")
            operacion = "division"
        }
        buttonRaiz.setOnClickListener {
            operando.setText("√")
            numero2.setText("")
            operacion = "sqrt"
        }
        buttonCuadrado.setOnClickListener {
            operando.setText("x²")
            numero2.setText("")
            operacion = "sq"
        }
        buttonMOD.setOnClickListener {
            operando.setText("MOD")
            operacion = "mod"
        }
        buttonDEL.setOnClickListener {
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

                    if ()
                    var num2int = (numero2.getText().toString()).toDouble()

                    resultado.setText((num1int + num2int).toString())
                    if (esperado.getText().toString() == resultado.getText().toString()){
                        esperado.setBackgroundColor(Color.GREEN)
                    } else{
                        esperado.setBackgroundColor(Color.RED)
                    }
                }
                "resta" -> {
                    var num2int = (numero2.getText().toString()).toDouble()
                    resultado.setText((num1int - num2int).toString())
                }
                "producto" ->
                {
                    var num2int = (numero2.getText().toString()).toDouble()
                    resultado.setText((num1int * num2int).toString())
                }
                "division" -> {
                    var num2int = (numero2.getText().toString()).toDouble()
                    resultado.setText((num1int / num2int).toString())
                }
                "sq" -> resultado.setText((num1int * num1int).toString())
                "sqrt" -> resultado.setText((sqrt(num1int)).toString())
            }
        }

    }
}