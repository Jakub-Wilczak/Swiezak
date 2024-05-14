package com.example.swiezak.model

import androidx.annotation.DrawableRes

data class Product(
    @DrawableRes
    val productIcon: Int,
    @DrawableRes
    val categoryIcon: Int,
    val name: String,
    val category: String,


    )
