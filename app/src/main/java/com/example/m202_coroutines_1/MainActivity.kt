package com.example.m202_coroutines_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* runBlocking {
            delay(7000L)
        }

        var tv = findViewById<TextView>(R.id.textView)

        tv.setText("Download Complete")

        */

         GlobalScope.launch {

            delay(7000L)

            getData()


        }


        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {

            val i = Intent(this,MainActivity2::class.java)

            startActivity(i)


        }

    }

    fun getData() {

        var tv = findViewById<TextView>(R.id.textView)

        tv.setText("Download Complete")

    }
}