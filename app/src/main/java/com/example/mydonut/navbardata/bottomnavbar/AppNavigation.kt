package com.example.mydonut.navbardata.bottomnavbar

import ProfileAriyana
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mydonut.DonutHomeContent
import com.example.mydonut.DonutdetailScreen
import com.example.mydonut.data.DataResource
import com.example.mydonut.screen.GridViewOutlet


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfBottomNav.forEach { bottomNav: BottomNav ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any { it.route == bottomNav.route } == true,
                        onClick = {
                            navController.navigate(bottomNav.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = bottomNav.icon,
                                contentDescription = null
                            )
                        },
                        label = {
                            Text(text = bottomNav.label)
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.DonutHomeContent.name,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(route = Screens.DonutHomeContent.name) {
                DonutHomeContent(navController = navController)
            }
            composable(
                route = "DonutdetailScreen/{donutId}",
                arguments = listOf(navArgument("donutId") { type = NavType.StringType })
            ) { backStackEntry ->
                val donutId = backStackEntry.arguments?.getString("donutId")
                val donut = DataResource.donut.get(donutId)
                donut?.let { DonutdetailScreen(donut = donut) }

                // Donut detail screen sudah saya buat, hanya saja tidak bisa ditampilkan di navigasinya, Kak
                // Drink detail screen juga sudah saya buat //
            }
            composable(route = Screens.OutletScreen.name) {
                GridViewOutlet()
            }
            composable(route = Screens.ProfileScreen.name) {
                ProfileAriyana()
            }
        }
    }
}


