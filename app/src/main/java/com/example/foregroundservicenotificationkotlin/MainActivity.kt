package com.example.foregroundservicenotificationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonStart : Button
    lateinit var buttonStop : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStart = findViewById(R.id.btnStart)
        buttonStop = findViewById(R.id.btnStop)

        buttonStart.setOnClickListener(View.OnClickListener {
            ForegroundService.startService(this, "Foreground Service is running...")
        })
        buttonStop.setOnClickListener(View.OnClickListener {
            ForegroundService.stopService(this)
        })
    }
}