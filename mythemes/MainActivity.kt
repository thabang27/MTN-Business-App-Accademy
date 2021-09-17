package com.thabang.mythemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn5 = findViewById(R.id.button5)as Button
        btn5.setOnClickListener {
            val intent = Intent(this, AnotherPage::class.java)
            startActivity(intent)
        }
        val btn6 = findViewById(R.id.button6)as Button
        btn6.setOnClickListener {
            val intent = Intent(this, AnotherPage::class.java)
            startActivity(intent)
        }
        val btn3 = findViewById(R.id.button3)as Button
        btn3.setOnClickListener {
            Toast.makeText(this,"Goodbye",Toast.LENGTH_SHORT).show()
            finish()
        }
        val btn4 = findViewById(R.id.button4)as Button
        btn4.setOnClickListener {
            Toast.makeText(this,"You are staying",Toast.LENGTH_SHORT).show()
        }
    }
}