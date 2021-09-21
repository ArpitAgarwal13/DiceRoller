package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        rollDice()
    }

    private fun rollDice() {
        val dice : Dice = Dice(6)
        val diceImage : ImageView = findViewById(R.id.imageView)

        val diceRoll = dice.rollDice()

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()

    }
}