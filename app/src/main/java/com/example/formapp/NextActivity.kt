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

        val textView1=findViewById<TextView>(R.id.textView1)
        textView1.text=message
        val textView2=findViewById<TextView>(R.id.textView2)
        textView2.text=message
        val textView3=findViewById<TextView>(R.id.textView3)
        textView3.text=message
        val textView4=findViewById<TextView>(R.id.textView4)
        textView4.text=message
        val textView5=findViewById<TextView>(R.id.textView5)
        textView5.text=message

    }
}