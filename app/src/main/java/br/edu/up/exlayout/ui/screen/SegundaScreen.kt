package br.edu.up.exlayout.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SegundaScreen(modifier: Modifier = Modifier) {
    LayoutXadrez(modifier)
}

@Preview(
    device = Devices.PIXEL
)

@Composable
fun LayoutXadrez(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .weight(1f))
            Box(modifier = Modifier
                .background(Color.Yellow)
                .fillMaxHeight()
                .weight(1f))
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            Box(modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight()
                .weight(1f))
            Box(modifier = Modifier
                .background(Color.Blue)
                .fillMaxHeight()
                .weight(1f))
        }
    }
}

@Composable
fun Layout2(){
    val cores1alinha = mutableListOf(
        Color.Green,
        Color.Red)
    val cores2alinha = mutableListOf(
        Color.Yellow,
        Color.Blue)

    Column(modifier = Modifier.fillMaxSize()) {

        val modifierRow = Modifier
            .fillMaxWidth()
            .weight(1f)
        var modifierBox = Modifier
            .fillMaxHeight()
            .weight(1f)

        Row(modifier = modifierRow){
            cores1alinha.forEach { cor ->
                Box(modifier = modifierBox
                    .then(Modifier.background(cor)))
            }
        }
        Row(modifier = modifierRow){
            cores2alinha.forEach { cor ->
                Box(modifier = modifierBox
                    .then(Modifier.background(cor)))
            }
        }
    }
}