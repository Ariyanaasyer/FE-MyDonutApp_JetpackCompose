package com.example.mydonut.data

import java.io.Serializable

data class Donut(
    val id: String,
    val variant: String,
    val price: String,
    val description: String,
    val donutImageId: Int
) : Serializable {

    fun get(donut: String?): Donut? {
        return null
    }
}

