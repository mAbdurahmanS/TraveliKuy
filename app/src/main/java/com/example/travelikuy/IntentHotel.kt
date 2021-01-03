package com.example.travelikuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_intent_hotel.*

class IntentHotel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_hotel)

        var intent = intent
        val aTitle = intent.getStringExtra("iTitle")
        val aLocation = intent.getStringExtra("iLocation")
        val aImg = intent.getIntExtra("iImg", 0)

        tv_title.text = aTitle
        tv_location.text = aLocation
        imageView4.setImageResource(aImg)
    }
}