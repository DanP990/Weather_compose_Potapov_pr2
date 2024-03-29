package com.dan_human.weather_compose_potapov

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dan_human.weather_compose_potapov.UserInterface.Settings.ScaffoldSettings
import com.dan_human.weather_compose_potapov.UserInterface.home.ScaffoldHome
import com.dan_human.weather_compose_potapov.ui.theme.Weather_compose_PotapovTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Weather_compose_PotapovTheme {
                NavHost(navController = navController,
                    startDestination = "ScaffoldHome",
                    builder = {
                        composable("ScaffoldHome") {
                            ScaffoldHome {
                                navController.navigate("ScaffoldSettings")
                            }
                        }
                        composable("ScaffoldSettings") {
                            ScaffoldSettings {
                                navController.navigate("ScaffoldHome")
                            }


                        }
                    })
            }
        }
    }
}

@Preview
@Composable
fun BackGround() {
    Image(
        painter = painterResource(id = R.drawable.background),
        contentDescription = "background image",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
}

