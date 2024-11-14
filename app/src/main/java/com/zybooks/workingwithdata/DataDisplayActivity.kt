package com.zybooks.workingwithdata

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DataDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.data_display)

        val nasaData = MockNasaApiData.getMockData()

        val textView: TextView = findViewById(R.id.textView)
        textView.text = "Most Recent Natural Imagery Date: ${nasaData.naturalDate}"
    }
}
