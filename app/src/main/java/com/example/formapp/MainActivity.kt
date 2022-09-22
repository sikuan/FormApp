package com.example.formapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showMessage(v: View){
        if(v.id==R.id.btnSend)
        {
            //kotlin reference object for edit text
            val editText=findViewById<EditText>(R.id.editName)
            // Getting input calue from edittext object
            val message=editText.text.toString()

            //defining an intent object
            val intent= Intent(this@MainActivity, NextActivity::class.java)
            //Intent intent=new Intent(MainActivity.this,NextActivity.class);

            intent.putExtra("Message", message)
            startActivity(intent)

            //Toast.makeText(applicationContext, message, Toast.LENGTH_LONG ).show()
        }
    }
}