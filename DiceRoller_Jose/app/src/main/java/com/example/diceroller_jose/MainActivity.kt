package com.example.diceroller_jose

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val rerollButton: Button = findViewById(R.id.Reroll_button)
        rollDiceAction()
        rerollButton.setOnClickListener {
            rollDiceAction()


            //val textViewMA: TextView = findViewById(R.id.textViewAM)
            //textViewMA.text = "4"


            //val toastMA = Toast.makeText( this, "Dice Rolled!", Toast.LENGTH_LONG)
            //toastMA.show()

        }

    }

    private fun rollDiceAction() {
        val dice = Dice(6)
        val cubeRoll = dice.roll()
        val textViewMA: TextView = findViewById(R.id.textViewAM)
        textViewMA.text = cubeRoll.toString()
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.diceside_1)

        when (cubeRoll) {
            1 -> diceImage.setImageResource(R.drawable.diceside_1)
            2 -> diceImage.setImageResource(R.drawable.diceside_2)
            3 -> diceImage.setImageResource(R.drawable.diceside_3)
            4 -> diceImage.setImageResource(R.drawable.diceside_4)
            5 -> diceImage.setImageResource(R.drawable.diceside_5)
            6 -> diceImage.setImageResource(R.drawable.diceside_6)

        }



    }

    class Dice (val numSides: Int){
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}