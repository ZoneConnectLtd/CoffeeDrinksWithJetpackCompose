package com.alexzh.jetpackcomposeworkshop.ui.order.model

import androidx.annotation.DrawableRes
import androidx.compose.Model

@Model
data class OrderCoffeeDrink(
    val id: Long,
    val name: String,
    @DrawableRes val imageRes: Int,
    val description: String,
    val price: Double,
    var count: Int = 0
)