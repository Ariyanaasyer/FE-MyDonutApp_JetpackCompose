package com.example.mydonut.data

import com.example.mydonut.R

data class Drink (
    val id: Int,
    val variant: String,
    val price: String,
    val description: String,
    val drinkImageId: Int = 0
)