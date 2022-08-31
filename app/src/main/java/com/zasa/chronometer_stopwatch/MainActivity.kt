package com.zasa.chronometer_stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {

    private lateinit var chronometer : Chronometer
    private var running : Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chronometer = findViewById(R.id.cmChronometer)

    }

    fun startChronometer(view: View) {
        if (!running){
            chronometer.start()
            running = true
        }
    }

    fun pauseChronometer(view: View) {
        if (running){
            chronometer.stop()
            running = false
        }
    }

    fun resetChronometer(view: View) {

    }


}