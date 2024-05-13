package com.example.mydonut.navbardata.bottomnavbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNav (
 val label: String,
 val icon: ImageVector,
 val route: String,
)

val listOfBottomNav = listOf(
    BottomNav (
     label = "Home",
     icon = Icons.Default.Home,
     route = Screens.DonutHomeContent.name,
    ),
    BottomNav (
     label = "Outlet",
     icon = Icons.Default.Favorite,
     route = Screens.OutletScreen.name,
    ),
    BottomNav (
     label = "Profile",
     icon = Icons.Default.Face,
     route = Screens.ProfileScreen.name,
    ),
)