package com.example.formapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val intent=intent
        val message1=intent.getStringExtra("Message")
        val textView1=findViewById<TextView>(R.id.textView1)
        textView1.text=message1

        // I don't know how to change the below messages text
        val intent2=intent
        val message2=intent2.getStringExtra("Message2")
        val textView2=findViewById<TextView>(R.id.textView2)
        textView2.text=message2

        val intent3=intent
        val message3=intent3.getStringExtra("Message")
        val textView3=findViewById<TextView>(R.id.textView3)
        textView3.text=message3

        val intent4=intent
        val message4=intent4.getStringExtra("Message")
        val textView4=findViewById<TextView>(R.id.textView4)
        textView4.text=message4

        val intent5=intent
        val message5=intent5.getStringExtra("Message")
        val textView5=findViewById<TextView>(R.id.textView5)
        textView5.text=message5

    }
}