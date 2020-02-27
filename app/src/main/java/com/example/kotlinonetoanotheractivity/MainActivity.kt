package com.example.kotlinonetoanotheractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java)
            startActivity(intent)// this is how we switch from one to other activity in Kotlin
        }
    }
}