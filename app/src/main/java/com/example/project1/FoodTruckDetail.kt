package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.project1.databinding.ActivityFoodTruckDetailBinding

class FoodTruckDetail : AppCompatActivity() {
    private lateinit var binding: ActivityFoodTruckDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_truck_detail)

        binding = ActivityFoodTruckDetailBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        //val url = findViewById<TextView>(R.id.link)

//        val intent = Intent(Intent.ACTION_VIEW, url)
//        startActivity(intent);
    }


}