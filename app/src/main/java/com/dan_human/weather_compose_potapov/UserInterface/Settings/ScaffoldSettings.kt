package com.dan_human.weather_compose_potapov.UserInterface.Settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.dan_human.weather_compose_potapov.BackGround
import com.dan_human.weather_compose_potapov.UserInterface.home.MainCard
import com.dan_human.weather_compose_potapov.UserInterface.home.TabLayout

@Preview
@Composable
fun ScaffoldSettings() {
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "Settings")
        }, actions = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack, contentDescription = "ArrowBack"
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
        Settings()


    }
}