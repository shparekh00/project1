package com.example.project1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter(private var foodtrucks: List<FoodTruck>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView : TextView = itemView.findViewById(R.id.name)
        val locationTextView : TextView = itemView.findViewById(R.id.location)
        val timeTextView : TextView = itemView.findViewById(R.id.open_time)
        val foodImageView : ImageView = itemView.findViewById<ImageButton?>(R.id.foodImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.food_truck_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val foodTruck = foodtrucks[position]

        holder.apply{
            titleTextView.text = foodTruck.name
            locationTextView.text = foodTruck.location
            timeTextView.text = foodTruck.open_time
            foodImageView.setImageResource(when (foodTruck.image){
                0 -> R.drawable.streettacos
                1 -> R.drawable.buckhorngrill
                2 -> R.drawable.shahs
                3 -> R.drawable.starginger
                4 -> R.drawable.banginbowls
                5 -> R.drawable.heftygyros
                else -> throw Exception("No image found!")
            })

        }
        holder.itemView.setOnClickListener{
            val intent = Intent(it.context, FoodTruckDetail::class.java)
            intent.putExtra("name", foodTruck.name)
            intent.putExtra("location", foodTruck.location)
            intent.putExtra("time", foodTruck.open_time)
            intent.putExtra("website_link", foodTruck.website_link)
            intent.putExtra("description", foodTruck.description)
            intent.putExtra("image", foodTruck.image)
            startActivity(it.context, intent, null)
       }
    }



    override fun getItemCount() = foodtrucks.size
}