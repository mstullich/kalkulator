package com.example.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


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
        var button10 = findViewById<Button>(R.id.button10)
        var buttonC = findViewById<Button>(R.id.buttonC)
        var buttoneql = findViewById<Button>(R.id.buttoneql)
        var buttondiv = findViewById<Button>(R.id.buttondiv)
        var buttonsub = findViewById<Button>(R.id.buttonsub)
        var buttonadd = findViewById<Button>(R.id.buttonadd)
        var buttonmul = findViewById<Button>(R.id.buttonmul)
        var obliczanie = findViewById<TextView>(R.id.obliczanie)
        var wynik = findViewById<TextView>(R.id.wynik)



        button1.setOnClickListener {
            evaluateExpression("1", clear = true)
        }

        button2.setOnClickListener {
            evaluateExpression("2", clear = true)
        }

        button3.setOnClickListener {
            evaluateExpression("3", clear = true)
        }
        button4.setOnClickListener {
            evaluateExpression("4", clear = true)
        }

        button5.setOnClickListener {
            evaluateExpression("5", clear = true)
        }

        button6.setOnClickListener {
            evaluateExpression("6", clear = true)
        }

        button7.setOnClickListener {
            evaluateExpression("7", clear = true)
        }

        button8.setOnClickListener {
            evaluateExpression("8", clear = true)
        }

        button9.setOnClickListener {
            evaluateExpression("9", clear = true)
        }

        button0.setOnClickListener {
            evaluateExpression("0", clear = true)
        }

        /*Operators*/

        buttonadd.setOnClickListener {
            evaluateExpression("+", clear = true)
        }

        buttonsub.setOnClickListener {
            evaluateExpression("-", clear = true)
        }

        buttonmul.setOnClickListener {
            evaluateExpression("*", clear = true)
        }

        buttondiv.setOnClickListener {
            evaluateExpression("/", clear = true)
        }

        button10.setOnClickListener {
            evaluateExpression(".", clear = true)
        }

        buttonC.setOnClickListener {
            obliczanie.text = ""
            wynik.text = ""
        }

        buttoneql.setOnClickListener {
            val text = obliczanie.text.toString()
            val expression = ExpressionBuilder(text).build()

            val result = expression.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                wynik.text = longResult.toString()
            } else {
                wynik.text = result.toString()
            }
        }


    }



    fun evaluateExpression(string: String, clear: Boolean) {
        var obliczanie = findViewById<TextView>(R.id.obliczanie)
        var wynik = findViewById<TextView>(R.id.wynik)
        if(clear) {
            wynik.text = ""
            obliczanie.append(string)
        } else {
            obliczanie.append(wynik.text)
            obliczanie.append(string)
            wynik.text = ""
        }
    }
}







    }
}