package com.example.ed1constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var boxOne: TextView
    private lateinit var boxTwo: TextView
    private lateinit var boxThree: TextView
    private lateinit var boxFour: TextView
    private lateinit var boxFive: TextView
    private lateinit var buttonRed: View
    private lateinit var buttonYellow: View
    private lateinit var buttonGreen: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boxOne = findViewById(R.id.box_one)
        boxTwo = findViewById(R.id.box_two)
        boxThree = findViewById(R.id.box_three)
        boxFour = findViewById(R.id.box_four)
        boxFive = findViewById(R.id.box_five)
        buttonRed = findViewById(R.id.button_red)
        buttonYellow = findViewById(R.id.button_yellow)
        buttonGreen = findViewById(R.id.button_green)

        boxOne.setBackgroundColor(resources.getColor(R.color.dark_gray))
        boxOne.setTextColor(resources.getColor(R.color.white))

        boxTwo.setBackgroundColor(resources.getColor(R.color.light_gray))
        boxTwo.setTextColor(resources.getColor(R.color.white))

        buttonRed.setOnClickListener {
            changeColor(boxThree, resources.getColor(R.color.red), resources.getColor(R.color.white))
        }

        buttonYellow.setOnClickListener {
            changeColor(boxFour, resources.getColor(R.color.yellow), resources.getColor(R.color.white))
        }

        buttonGreen.setOnClickListener {
            changeColor(boxFive, resources.getColor(R.color.green), resources.getColor(R.color.white))
        }
    }

    private fun changeColor(textView: TextView, backgroundColor: Int, textColor: Int) {
        textView.setBackgroundColor(backgroundColor)
        textView.setTextColor(textColor)
    }
}
