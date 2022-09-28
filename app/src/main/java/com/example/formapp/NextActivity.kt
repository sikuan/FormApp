package com.example.formapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val intentName=intent //declaration get intent for name use
        val messageName=intentName.getStringExtra("MessageName")
        val nextTextViewName=findViewById<TextView>(R.id.showName)
        nextTextViewName.text=messageName // show msg

        val intentAddress=intent
        val messageAddress=intentAddress.getStringExtra("MessageAddress")
        val nextTextViewAddress=findViewById<TextView>(R.id.showAddress)
        nextTextViewAddress.text=messageAddress

        val intentProfession=intent
        val messageProfession=intentProfession.getStringExtra("MessageProfession")
        val nextTextViewProfession=findViewById<TextView>(R.id.showProfession)
        nextTextViewProfession.text=messageProfession

        val intentJob=intent
        val messageJob=intentJob.getStringExtra("MessageJob")
        val nextTextViewJob=findViewById<TextView>(R.id.showJob)
        nextTextViewJob.text=messageJob

        val intentFood=intent
        val messageFood=intentFood.getStringExtra("MessageFood")
        val nextTextViewFood=findViewById<TextView>(R.id.showFood)
        nextTextViewFood.text=messageFood

    }
}