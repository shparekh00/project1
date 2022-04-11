package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FoodTruckDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_truck_detail)

        val url = findViewById<TextView>(R.id.link)

//        val intent = Intent(Intent.ACTION_VIEW, url)
//        startActivity(intent);
    }


}