package com.example.mydonut

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import com.example.mydonut.data.Donut
import com.example.mydonut.data.Drink

@Composable
fun DrinkdetailScreen(drink: Drink) {
    val ScrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(state = ScrollState)
                ) {
                    DetailHeader(drink = drink, containerHeight = this@BoxWithConstraints.maxHeight)
                    DetailContent(drink = drink, containerHeight = this@BoxWithConstraints.maxHeight)
                }
            }
        }
    }
}

@Composable
private fun DetailHeader(
    drink: Drink,
    containerHeight: Dp
) {
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth(),
        painter = painterResource(id = drink.drinkImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun DetailContent(drink: Drink, containerHeight: Dp) {
    Column {
        Title(drink = drink)
        DetailProperty(label = stringResource(id = R.string.description), value = drink.description)
        DetailProperty(label = stringResource(id = R.string.price), value = drink.price)

        Spacer(modifier = Modifier.height((containerHeight - 300.dp).coerceAtLeast(0.dp)))
    }
}

@Composable
private fun Title(drink: Drink) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = drink.variant,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun DetailProperty(label: String, value: String) {
    Column(modifier = Modifier.padding(start = 14.dp, end = 14.dp, bottom = 14.dp)) {
        Divider()
        Text(
            text = label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.labelLarge
        )
    }
}