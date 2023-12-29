package com.dan_human.weather_compose_potapov.UserInterface.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.dan_human.weather_compose_potapov.BackGround


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScaffoldHome() {
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "Weather")
        }, actions = {
            IconButtonSettings()
        })
    }, bottomBar = {
        BottomAppBar(
            backgroundColor = Color.Transparent
        ) {

            Spacer(Modifier.weight(1f, true))
            IconButtonFavorite()
            IconButtonShare()

        }
    }) {
        BackGround()
        Column {
            MainCard()
            TabLayout()
        }

    }
}

@Composable
fun IconButtonSettings(){
    IconButton(onClick = {}) {
        Icon(
            imageVector = Icons.Filled.Settings, contentDescription = "Settings"
        )
    }
}

@Composable
fun IconButtonFavorite(){
    IconButton(onClick = { /* Handle icon click */ }) {
        Icon(
            Icons.Filled.Favorite, contentDescription = "Favorite"
        )
    }
}

@Composable
fun IconButtonShare(){
    IconButton(onClick = { /* Handle icon click */ }) {
        Icon(
            Icons.Filled.Share, contentDescription = "Share"
        )
    }
}