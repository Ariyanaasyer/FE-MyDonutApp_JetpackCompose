package com.example.mydonut

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.mydonut.data.Donut
import com.example.mydonut.navbardata.bottomnavbar.AppNavigation
import com.example.mydonut.ui.theme.MyDonutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyDonutTheme {
                MyDonut {
                    startActivity(ProfileActivity.newIntent(context = this,it))
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyDonut(navigateToProfile: (Donut) -> Unit) {
    Scaffold(
        content = {
            DonutHomeContent(navController = rememberNavController())
            AppNavigation()
        }
    )
}