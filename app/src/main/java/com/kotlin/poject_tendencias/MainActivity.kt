package com.kotlin.poject_tendencias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            val numero_1 = parseInt(txtNum1.text.toString())
            val numero_2 = parseInt(txtNum2.text.toString())
            val resultado = numero_1 + numero_2

        }

    }

    private fun showAlert(){

    }
}