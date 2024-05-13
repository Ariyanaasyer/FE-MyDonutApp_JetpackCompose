package com.example.mydonut

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mydonut.data.DataResource.drink
import com.example.mydonut.data.DataResource.drinkList
import com.example.mydonut.data.Donut
import com.example.mydonut.data.Drink

@Composable
fun DrinkListItem(drink: Drink, navController: NavController) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.elevatedCardColors(containerColor = Color.White),
        shape = RoundedCornerShape(corner = CornerSize(14.dp))
    ) {
        Row(
            Modifier.clickable {
                navController.navigate("DrinkdetailScreen/${drink.id}")
                // detail screen tidak bisa dijalankan :( //
            },
        ) {
            DrinkImage(drink = drink)
            Column (
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = drink.variant, style = MaterialTheme.typography.titleMedium)
                Text(text = "Drinks", style = MaterialTheme.typography.bodyLarge)
            }
        }
    }
}

@Composable
fun DrinkImage(drink: Drink){
    Image(
        painter = painterResource(id = drink.drinkImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(80.dp)
            .clip(RoundedCornerShape(corner = CornerSize(20.dp)))
    )
}