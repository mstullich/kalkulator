package com.example.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var button1 = findViewById<Button>(R.id.button1)
        var button2 = findViewById<Button>(R.id.button2)
        var button3 = findViewById<Button>(R.id.button3)
        var button4 = findViewById<Button>(R.id.button4)
        var button5 = findViewById<Button>(R.id.button5)
        var button6 = findViewById<Button>(R.id.button6)
        var button7 = findViewById<Button>(R.id.button7)
        var button8 = findViewById<Button>(R.id.button8)
        var button9 = findViewById<Button>(R.id.button9)
        var button0 = findViewById<Button>(R.id.button0)
        var buttonC = findViewById<Button>(R.id.buttonC)
        var buttoneql = findViewById<Button>(R.id.buttoneql)
        var buttondiv = findViewById<Button>(R.id.buttondiv)
        var buttonsub = findViewById<Button>(R.id.buttonsub)
        var buttonadd = findViewById<Button>(R.id.buttonadd)
        var buttonmul = findViewById<Button>(R.id.buttonmul)
    }
}