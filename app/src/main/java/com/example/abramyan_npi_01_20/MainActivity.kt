package com.example.abramyan_npi_01_20

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonFragment1: Button = findViewById(R.id.ma_bf1)
        val textFragment1: TextView = findViewById(R.id.ma_tv1)
        buttonFragment1.setOnClickListener {
            val currentDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a"))
            textFragment1.text = currentDate.toString()
        }
    }
}