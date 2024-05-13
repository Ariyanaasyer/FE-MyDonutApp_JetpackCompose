package com.example.mydonut

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.mydonut.data.Donut
import com.example.mydonut.ui.theme.MyDonutTheme

@Suppress("DEPRECATION")
class ProfileActivity : ComponentActivity() {

    private val donut: Donut by lazy {
        intent?.getSerializableExtra(DONUT_ID) as Donut
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            MyDonutTheme {
                DonutdetailScreen(donut = donut)
            }
        }
    }

    companion object {
        private const val DONUT_ID = "donut_id"
        fun newIntent(context: Context, donut: Donut) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(DONUT_ID, donut)
            }
    }
}