package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        var button_open=findViewById<Button>(R.id.button_open)
        button_open.setOnClickListener{
            openDetailActivity()
        }

    }

    fun openDetailActivity() {
        val intent = Intent(this, ActivityDetail::class.java)
        startActivity(intent)
    }
}