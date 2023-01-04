package com.example.zadanienaocene

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var przycisk = findViewById<Button>(R.id.buttonPasswordHeck)
        var wyswietlacz = findViewById<TextView>(R.id.TextVievCheckingPassword)
        var haslo = findViewById<TextInputEditText>(R.id.TIET3)
        var haslopowtorz = findViewById<TextInputEditText>(R.id.TIET4)

        przycisk.setOnClickListener {
            if(haslo.text.toString() == haslopowtorz.text.toString()){
                wyswietlacz.text = "Hasła są identyczne"
                haslo.setTextColor(Color.GREEN)
                haslopowtorz.setTextColor(Color.GREEN)

            }else{
                wyswietlacz.text = "Hasła się różne"
                haslo.setTextColor(Color.RED)
                haslopowtorz.setTextColor(Color.RED)
            }

        }
    }
}