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
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.Settings, contentDescription = "Settings"
                )
            }
        })
    }, bottomBar = {
        BottomAppBar(
            backgroundColor = Color.Transparent
        ) {

            Spacer(Modifier.weight(1f, true))
            IconButton(onClick = { /* Handle icon click */ }) {
                Icon(
                    Icons.Filled.Favorite, contentDescription = "Favorite"
                )
            }
            IconButton(onClick = { /* Handle icon click */ }) {
                Icon(
                    Icons.Filled.Share, contentDescription = "Share"
                )
            }

        }
    }) {
        BackGround()
        Column {
            MainCard()
            TabLayout()
        }

    }
}