package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.net.Uri

class MainActivity : AppCompatActivity() {

    private lateinit var btn: Button
    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)
        val url = "https://mirea.ru"
        btn.setOnClickListener {
            // неявное намерение
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
        btn2.setOnClickListener {
            // явное намерение
            val intent = Intent(applicationContext, MainActivity2::class.java)
            intent.putExtra("key","Hello from MainActivity!")
            startActivity(intent)
        }
    }
}