package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var imageUser:ImageView
    lateinit var textUserName:TextView
    lateinit var buttonUserFollow:Button
    lateinit var textUserFollowers:TextView
    lateinit var texUserFollowing:TextView
    var follow:Boolean=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageUser = findViewById(R.id.imageUser)
        textUserName = findViewById(R.id.textNameUser)
        buttonUserFollow = findViewById(R.id.buttonUserFollow)
        textUserFollowers = findViewById(R.id.textFollowers)
        texUserFollowing = findViewById(R.id.textFollowing)

        buttonUserFollow.setOnClickListener {
            if (follow){
                buttonUserFollow.text="UNFOLLOW"
                follow=false
            }
            else{
                buttonUserFollow.text="FOLLOW"
                follow=true
            }

        }


    }
}