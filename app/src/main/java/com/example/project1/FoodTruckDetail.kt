package com.example.project1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.project1.databinding.ActivityFoodTruckDetailBinding

class FoodTruckDetail() : AppCompatActivity() {
    private lateinit var binding: ActivityFoodTruckDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFoodTruckDetailBinding.inflate(layoutInflater)

        val image = intent.getIntExtra("image", 6)
        binding.nameDetail.text = intent.getStringExtra("name")
        binding.locationDetail.text = intent.getStringExtra("location")
        binding.timeDetail.text = intent.getStringExtra("time")

        binding.foodDetailImage.setImageResource(when (image){
            0 -> R.drawable.streettacos
            1 -> R.drawable.buckhorngrill
            2 -> R.drawable.shahs
            3 -> R.drawable.starginger
            4 -> R.drawable.banginbowls
            5 -> R.drawable.heftygyros
            else -> throw Exception("No image found!")
        })
        binding.description.text = intent.getStringExtra("description")

        var view = binding.root
        setContentView(view)

        val website_link = intent.getStringExtra("website_link")
        binding.link.setOnClickListener {
            val uri = Uri.parse(website_link)
            val link_intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(link_intent)
        }




    }


}


