package com.example.mydonut

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mydonut.data.DataResource
import com.example.mydonut.data.DataResource.donut
import com.example.mydonut.data.DataResource.drink
import com.example.mydonut.data.Donut

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonutHomeContent(navController: NavController) {
    val donuts = remember { DataResource.donutList }
    val drinks = remember { DataResource.drinkList }
    Column {
        LazyRow(
            modifier = Modifier
                .height(160.dp)
                .fillMaxWidth(),
            contentPadding = PaddingValues(horizontal = 20.dp, vertical = 20.dp)
        ) {
            items(
                items = drinks,
                itemContent = { drink ->
                    Box(
                        modifier = Modifier
                            .padding(2.dp)
                            .drawWithContent {
                                drawContent()
                            }
                    ){
                        DrinkListItem(drink = drink, navController = navController )
                    }
                }
            )
        }
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(
                items = donuts,
                itemContent = { donut ->
                    DonutListItem(donut = donut, navController = navController)
                }
            )
        }
    }
}