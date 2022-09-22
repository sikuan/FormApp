package com.example.formapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val intent=intent
        val message=intent.getStringExtra("Message")

        val textView=findViewById<TextView>(R.id.textView)
        textView.text=message
    }
}