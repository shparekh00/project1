package com.example.project1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FoodTruck (
    var id: Int,
    var name: String,
    var image: Int,
    var location:String,
    var open_time: String,
    var description: String,
    var website_link: String,
):Parcelable