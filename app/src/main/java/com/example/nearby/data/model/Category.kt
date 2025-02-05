package com.example.nearby.data.model

import androidx.annotation.DrawableRes

data class Category(
    val id: String,
    val name: String,
) {
    @get:DrawableRes
    val icon: Int?
        get() = NearbyCategoryFilterView.fromDescription(description = name)?.icon
}
