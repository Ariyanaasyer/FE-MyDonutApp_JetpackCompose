package com.example.mydonut.screen


import android.annotation.SuppressLint
import android.widget.GridView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.solver.state.helpers.AlignHorizontallyReference
import com.example.mydonut.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun GridViewOutlet() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Outlet List") }
            )
        }
    ) {
        LazyVerticalStaggeredGrid(
            modifier = Modifier.padding(top = 56.dp),
            columns = StaggeredGridCells.Fixed(2),
            verticalItemSpacing = 5.dp,
            horizontalArrangement = Arrangement.spacedBy(5.dp),
        ) {
            items(gridViewModel.size) {
                Box(
                    Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = gridViewModel[it].image),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                    )
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .height(30.dp)
                            .align(Alignment.BottomCenter)
                            .background(Color.Black.copy(alpha = 0.4f)),
                        Arrangement.Center,
                        Alignment.CenterVertically
                    ) {
                        Text(
                            text = "${gridViewModel[it].name}",
                            style = TextStyle(
                                color = Color.White
                            ),
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }
        }
    }
}

data class GridViewModel (
    val name: String,
    val image: Int = 0
)