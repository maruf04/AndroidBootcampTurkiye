package com.example.bootcampstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceText: TextView
    lateinit var butonDegistir: Button
    lateinit var diceImage: ImageView
    lateinit var sendText: TextView
    lateinit var  sendButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceText = findViewById(R.id.diceText)
        butonDegistir = findViewById(R.id.butonDegistir)
        diceImage = findViewById(R.id.diceImage)
        sendText =findViewById(R.id.sendText)
        sendButton = findViewById(R.id.sendButton)



       butonDegistir.setOnClickListener {
            changeText()
        }
        sendButton.setOnClickListener {
            sendText()
        }
        //println("onCreate called")
    }

    private fun sendText() {
        val intent =Intent(this,secondActivity::class.java )
        intent.putExtra("send",sendText.text.toString())
        startActivity(intent)
    }

    private fun changeText() {
        val randomNumber = (1..6).random()

        val drawableResource = when(randomNumber){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice1
        }
        diceImage.setImageResource(drawableResource)
        diceText.text =randomNumber.toString()

        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()


    }

/*

    override fun onStart() {
        super.onStart()
        println("onStart called")
    }

    override fun onResume() {
        super.onResume()
        println("onResume called")
    }

    override fun onPause() {
        super.onPause()
        println("onPause called")
    }

    override fun onStop() {
        super.onStop()
        println("onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy called")
    }
*/
}