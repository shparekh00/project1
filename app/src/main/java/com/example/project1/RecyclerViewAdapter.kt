package com.example.project1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private var foodtrucks: List<FoodTruck>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView : TextView = itemView.findViewById(R.id.name)
        val locationTextView : TextView = itemView.findViewById(R.id.location)
        val timeTextView : TextView = itemView.findViewById(R.id.open_time)
        val foodImageView : ImageButton = itemView.findViewById(R.id.foodImageButton)
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
    }

    override fun getItemCount() = foodtrucks.size
}