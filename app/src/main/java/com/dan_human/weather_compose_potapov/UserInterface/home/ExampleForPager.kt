package com.dan_human.weather_compose_potapov.UserInterface.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.dan_human.weather_compose_potapov.ui.theme.BlueLight

@Preview(showBackground = true)
@Composable
fun ListItem() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 3.dp),
        backgroundColor = BlueLight,
        elevation = 0.dp,
        shape = RoundedCornerShape(5.dp)

    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Column(
                modifier = Modifier.padding(start = 8.dp, top = 5.dp, bottom = 5.dp)
            ) {
                TimeHours()
                WeatherTypeHours()

            }
            TempretureHours()
            AsImageHours()
        }
    }
}

@Preview
@Composable
fun AsImageHours() {
    AsyncImage(
        model = "https://cdn.weatherapi.com/weather/64x64/night/116.png",
        contentDescription = "weather image 2",
        modifier = Modifier
            .size(35.dp)
            .padding(end = 8.dp)

    )
}

@Preview
@Composable
fun TempretureHours() {
    Text(
        text = "-8°C", color = Color.White, style = TextStyle(fontSize = 25.sp)
    )
}

@Preview
@Composable
fun TimeHours() {
    Text(text = "12:00", color = Color.White)
}

@Preview
@Composable
fun WeatherTypeHours() {
    Text(text = "Sunny", color = Color.White)
}