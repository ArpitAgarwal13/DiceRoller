package com.example.diceroller

class Dice (val numSides : Int) {

    fun rollDice() : Int {
        return (1..numSides).random()
    }
}