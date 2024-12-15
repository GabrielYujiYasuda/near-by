package com.example.nearby.data.model

import androidx.annotation.DrawableRes
import com.example.nearby.R

enum class NearbyCategoryFilterView(
    val description: String,
    @DrawableRes val icon: Int
) {
    FOOD(description = "Food" , icon = R.drawable.ic_tools_kitchen_2),
    SHOP(description = "Shop", icon = R.drawable.ic_shopping_bag),
    ACCOMMODATION(description = "Accommodation", icon = R.drawable.ic_bed),
    SUPERMARKET(description = "Supermarket", icon = R.drawable.ic_shopping_cart),
    ENTERTAINMENT(description = "Entertainment", icon = R.drawable.ic_movie),
    DRUGSTORE(description = "Drugstore", icon = R.drawable.ic_first_aid_kit),
    GASSTATION(description = "Gasstation", icon = R.drawable.ic_gas_station),
    BAKERY(description = "Bakery", icon = R.drawable.ic_bakery);

    companion object {
        fun fromDescription(description: String): NearbyCategoryFilterView? {
            return entries.find { it.description == description }
        }
    }
}