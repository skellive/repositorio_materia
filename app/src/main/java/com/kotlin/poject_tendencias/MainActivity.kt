package com.kotlin.poject_tendencias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.text.set
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
    }

    private fun setup(){

        button.setOnClickListener {
            showAlert()

        }

    }

    private fun showAlert(){
        val numero_1 = parseInt(txtNum1.text.toString())
        val numero_2 = parseInt(txtNum2.text.toString())
        val resultado = numero_1 + numero_2
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Resultado")
        builder.setMessage("El resultado es: $resultado")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()

    }
}