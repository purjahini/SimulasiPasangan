package com.bedev.kocokdadu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val putarButton: Button = findViewById(R.id.btn_putar)
        putarButton.setOnClickListener {
            kocokDadu()
            kocok2()
        }


    }

    private fun kocokDadu() {

        val randomInt = Random.nextInt(6) + 1
        val draw = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5

            else -> R.drawable.dice_6

        }
        val hasil: ImageView = findViewById(R.id.dadu_view)
        hasil.setImageResource(draw)

    }
    private fun kocok2 (){
        val ran = Random.nextInt(6)+1
        val draw2 = when (ran){
            1 -> R.drawable.dice_6
            2 -> R.drawable.dice_5
            3 -> R.drawable.dice_4
            4 -> R.drawable.dice_3
            5 -> R.drawable.dice_2

            else -> R.drawable.dice_1

        }
        val hasil2: ImageView = findViewById(R.id.dadu_view2)
        hasil2.setImageResource(draw2)
    }


}
