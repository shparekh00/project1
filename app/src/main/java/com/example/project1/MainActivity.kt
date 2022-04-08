package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val foodtruck = listOf(
        FoodTruck(
            id: 0,
            name: "Authentic Street Taco",
            location: "Silo Patio",
            open_time: "11am - 4pm",
            description: "A unique blend of street taco with high-quality ingredients to give you the highest quality Mexican food.",
            website_link: "https://www.authenticstreettaco.com/"
        ),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }





}