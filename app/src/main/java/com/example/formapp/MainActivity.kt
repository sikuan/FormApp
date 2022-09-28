package com.example.formapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showMessage(v: View){
        if(v.id==R.id.btnSend)
        {
            val intent= Intent(this@MainActivity, NextActivity::class.java)


            val editName=findViewById<EditText>(R.id.editName) //find edit text id
            val messageName=editName.text.toString() // declare with edited text
            val editAddress=findViewById<EditText>(R.id.editAddress)
            val messageAddress=editAddress.text.toString()
            val editProfession=findViewById<EditText>(R.id.editProfession)
            val messageProfession=editProfession.text.toString()
            val editJob=findViewById<EditText>(R.id.editJob)
            val messageJob=editJob.text.toString()
            val editFood =findViewById<EditText>(R.id.editFood)
            val messageFood=editFood.text.toString()

            //Put msg to variables
            intent.putExtra("MessageName", messageName)
            intent.putExtra("MessageAddress", messageAddress)
            intent.putExtra("MessageProfession", messageProfession)
            intent.putExtra("MessageJob", messageJob)
            intent.putExtra("MessageFood", messageFood)

            startActivity(intent) //Start app

        }
    }
}