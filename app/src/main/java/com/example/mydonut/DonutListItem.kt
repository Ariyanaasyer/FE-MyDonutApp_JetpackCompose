@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.mydonut

import android.content.Intent
import android.security.identity.AccessControlProfile
import android.speech.ModelDownloadListener
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import com.example.mydonut.data.Donut

@Composable
fun DonutListItem(donut: Donut, navController: NavController) {
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
                Log.d("Navigation", "Navigating to DonutdetailScreen with donutId: ${donut.id}")
                navController.navigate("DonutdetailScreen/{donutId}")
                Log.d("Navigation", "Navigation completed")
            },
        ) {
            DonutImage(donut = donut)
            Column (
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = donut.variant, style = MaterialTheme.typography.titleMedium)
                Text(text = "Donut", style = MaterialTheme.typography.bodyLarge)
            }
        }
    }
}

@Composable
fun DonutImage(donut: Donut){
    Image(
        painter = painterResource(id = donut.donutImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(80.dp)
            .clip(RoundedCornerShape(corner = CornerSize(20.dp)))
    )
}


