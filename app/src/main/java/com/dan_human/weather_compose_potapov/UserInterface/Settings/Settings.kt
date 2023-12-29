package com.dan_human.weather_compose_potapov.UserInterface.Settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dan_human.weather_compose_potapov.ui.theme.BlueLight


@Preview
@Composable
fun Settings() {
    val checkedState = remember { mutableStateOf(false) }
    var text = " "

    Card(
        modifier = Modifier.fillMaxSize(),
        backgroundColor = BlueLight,
        elevation = 0.dp,
        shape = RoundedCornerShape(10.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextSettings()
            TextField(checkedState.value)

            Row(
                modifier = Modifier.padding(bottom = 40.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                TextGeo()
                CheckBox(checkedState)

            }


        }


    }


}


@Composable
fun TextSettings() {
    Text(
        text = "Settings",
        style = TextStyle(fontSize = 25.sp),
        color = Color.White,
    )

}

@Composable
fun TextField(value: Boolean) {
    var text = " "
    OutlinedTextField(enabled = !value,
        value = text,
        onValueChange = { text = it },
        label = { Text("City") })
}

@Composable
fun TextGeo() {
    Text(
        text = "Geolocation",
        style = TextStyle(fontSize = 22.sp),
        color = Color.White,
    )
}


@Composable
fun CheckBox(bebra: MutableState<Boolean>) {
    Checkbox(
        checked = bebra.value,
        onCheckedChange = {
            bebra.value = it
        },
    )
}

