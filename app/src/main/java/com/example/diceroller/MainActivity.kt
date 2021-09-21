package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            // Toast is a text which is shown for a brief period at bottom of screen after button is clicked
//            val toast = Toast.makeText(this, "Dice Rolled!!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val dice : Dice = Dice(6)
        val resultTextView : TextView = findViewById(R.id.textView)
        resultTextView.text = dice.rollDice().toString()
    }
}