package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        val data = bundle?.getString("key")
        Snackbar.make(findViewById(R.id.root2),data.toString(),Snackbar.LENGTH_LONG).show()
    }
}