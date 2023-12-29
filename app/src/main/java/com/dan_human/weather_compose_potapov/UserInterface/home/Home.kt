package com.dan_human.weather_compose_potapov.UserInterface.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.dan_human.weather_compose_potapov.R
import com.dan_human.weather_compose_potapov.ui.theme.BlueLight

@Preview(showBackground = true)
@Composable
fun MainCard() {

    Column(
        modifier = Modifier.padding(5.dp),

        ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = BlueLight,
            elevation = 0.dp,
            shape = RoundedCornerShape(10.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Date()
                    AsImage()
                }
                City()
                Tempreture()
                WeatherType()
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    ButtonSearch()
                    MaxMinWeather()
                    ButtonSync()

                }

            }

        }

    }
}

@Preview
@Composable
fun Date() {
    Text(
        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
        text = "15 Dec 2023 12:00",
        style = TextStyle(fontSize = 15.sp),
        color = Color.White,

        )
}

@Preview
@Composable
fun AsImage() {
    AsyncImage(
        model = "https://cdn.weatherapi.com/weather/64x64/night/116.png",
        contentDescription = "weather image",
        modifier = Modifier
            .size(35.dp)
            .padding(top = 4.dp, end = 8.dp)

    )
}

@Preview
@Composable
fun City() {
    Text(
        text = "Moscow",
        style = TextStyle(fontSize = 25.sp),
        color = Color.White,

        )
}

@Preview
@Composable
fun Tempreture() {
    Text(
        text = "-10°C",
        style = TextStyle(fontSize = 65.sp),
        color = Color.White,

        )
}

@Preview
@Composable
fun WeatherType() {
    Text(
        text = "Sunny",
        style = TextStyle(fontSize = 18.sp),
        color = Color.White,

        )

}

@Preview
@Composable
fun ButtonSearch() {
    IconButton(onClick = {

    }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "Image button search",
            tint = Color.White
        )
    }
}

@Preview
@Composable
fun MaxMinWeather() {
    Text(
        text = "-8C/-12°C",
        style = TextStyle(fontSize = 18.sp),
        color = Color.White,

        )
}

@Preview
@Composable
fun ButtonSync() {
    IconButton(onClick = {

    }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_sync),
            contentDescription = "Image button sync",
            tint = Color.White
        )
    }
}

