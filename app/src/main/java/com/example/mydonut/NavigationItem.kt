package com.example.mydonut

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.mydonut.navbardata.bottomnavbar.Screens

data class NavigationItem(
    val title: String,
    val icon: ImageVector,
    val screen: Screens,
)