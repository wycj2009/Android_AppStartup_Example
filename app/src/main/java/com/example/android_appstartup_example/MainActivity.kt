package com.example.android_appstartup_example

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        var log = ""
    }

    private lateinit var activityMainTextviewLog: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityMainTextviewLog = findViewById(R.id.activity_main_textview_log)

        activityMainTextviewLog.text = log
    }

}