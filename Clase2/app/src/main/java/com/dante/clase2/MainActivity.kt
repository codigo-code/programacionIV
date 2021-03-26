package com.dante.clase2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // declarar la variable y asginarla al tipo de elemento que tenemos en la vista

        // creacion de objetos es con val o var
        // val hace referencia a constantes
        // var a variables

        // val / var nombreVariable: type
        // final String nombre = dante; ( java ) ---> nombre ---> resultado ----  nombre="pepe" <-- error!
        // C# const string nombre = "pepe";    nombre = " algo " --_> KAABOOM!

        // generar una constante de tipo editText que la incializamos con el objeto e_nombre
        val nombre: EditText = findViewById(R.id.e_nombre)

        // mapeamo el boton
        val press: Button = findViewById(R.id.b_press)

        // mapeamos el header
        val header: TextView = findViewById(R.id.textView)

        // var nombre {get;set;}
        press.setOnClickListener(View.OnClickListener {
           header.text = "Hola " +  nombre.text // internamente header.setText(nombre.getText());
        })




    }
}