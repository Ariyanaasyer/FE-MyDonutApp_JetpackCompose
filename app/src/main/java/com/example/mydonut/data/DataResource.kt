package com.example.mydonut.data

import com.example.mydonut.R

object DataResource {
    val donut =
        Donut(
            id = "donut1",
            variant = "Strawberry Sprinkle",
            price = "Rp.25.000",
            description = "Donut with Strawberry Sprinkle",
            donutImageId = R.drawable.d1
        )

    val donutList = listOf(
        donut,
        Donut(
            id = "donut2",
            variant = "Choco Rainbow Sprinkle",
            price = "Rp.25.000",
            description = "Donut with rainbow Sprinkle",
            donutImageId = R.drawable.d2
        ),
        Donut(
            id = "donut3",
            variant = "Original Glaze",
            price = "Rp.25.000",
            description = "Donut with Sugar Glaze",
            donutImageId = R.drawable.d3
        ),
        Donut(
            id = "donut4",
            variant = "Choco Glaze Rainbow Sprinkle",
            price = "Rp.25.000",
            description = "Donut dipped choco with rainbow Sprinkle",
            donutImageId = R.drawable.d4
        ),
        Donut(
            id = "donut5",
            variant = "White Choco Rainbow Sprinkle",
            price = "Rp.25.000",
            description = "Donut dipped white choco with rainbow Sprinkle",
            donutImageId = R.drawable.d5
        ),
        Donut(
            id = "donut6",
            variant = "Choco Bagel",
            price = "Rp.25.000",
            description = "Donut full choco bagel",
            donutImageId = R.drawable.d6
        ),
        Donut(
            id = "donut7",
            variant = "Dipped Peanut Almond",
            price = "Rp.25.000",
            description = "Donut with full peanut almond",
            donutImageId = R.drawable.d7
        ),
        Donut(
            id = "donut8",
            variant = "Dipped Peanut Almond",
            price = "Rp.25.000",
            description = "Donut with full peanut almond",
            donutImageId = R.drawable.d8
        ),
        Donut(
            id = "donut9",
            variant = "Strawberry Jam",
            price = "Rp.25.000",
            description = "Donut with full strawberry jam",
            donutImageId = R.drawable.d9
        ),
        Donut(
            id = "donut10",
            variant = "Coconut Flakes",
            price = "Rp.25.000",
            description = "Donut with full coconut spark",
            donutImageId = R.drawable.d10
        ),
    )

    val drink =
        Drink(
            id = 1,
            variant = "Hot Coffee Latte",
            price = "Rp.25.000",
            description = "Hot Coffee Latte with dairy milk",
            drinkImageId = R.drawable.c1
        )

    val drinkList = listOf(
        drink,
        Drink(
            id = 2,
            variant = "Hot Mocha Latte",
            price = "Rp.25.000",
            description = "Hot Mocha Latte with regular milk",
            drinkImageId = R.drawable.c2
        ),
        Drink(
            id = 3,
            variant = "Frape Ice Cappuccino",
            price = "Rp.25.000",
            description = "Ice Cappuccino Frape with whipped cream",
            drinkImageId = R.drawable.c3
        ),
        Drink(
            id = 4,
            variant = "Frape Ice Mocha Latte",
            price = "Rp.25.000",
            description = "Ice Mocha Latte Frape with chocolate syrup",
            drinkImageId = R.drawable.c4
        ),
        Drink(
            id = 5,
            variant = "Ice Matcha Latte",
            price = "Rp.25.000",
            description = "Ice Macha Latte with dairy milk",
            drinkImageId = R.drawable.c5
        ),
        Drink(
            id = 6,
            variant = "Frape Ice Strawberry Matcha",
            price = "Rp.25.000",
            description = "Ice Stawberry Matcha",
            drinkImageId = R.drawable.c6
        ),
        Drink(
            id = 7,
            variant = "Orange Juice",
            price = "Rp.25.000",
            description = "Ice Orange Juice",
            drinkImageId = R.drawable.c7
        ),
        Drink(
            id = 8,
            variant = "Frape Ice Hazelnut",
            price = "Rp.25.000",
            description = "Ice Hazelnut with whipped cream",
            drinkImageId = R.drawable.c8
        ),
        Drink(
            id = 9,
            variant = "Frape Ice Strawberry",
            price = "Rp.25.000",
            description = "Ice Strawberry with whipped cream",
            drinkImageId = R.drawable.c9
        ),
        Drink(
            id = 10,
            variant = "Frape Ice Caramel",
            price = "Rp.25.000",
            description = "Ice Caramel with whipped cream",
            drinkImageId = R.drawable.c10
        ),
    )
}