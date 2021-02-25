package com.example.bootcampstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondActivity : AppCompatActivity() {
    lateinit var secondText:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        secondText = findViewById(R.id.secondText)

        val getData =intent.getStringExtra("send")

        secondText.setText(getData)

    }
}