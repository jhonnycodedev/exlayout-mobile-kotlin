package br.edu.up.exlayout.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TerceiraScreen(modifier: Modifier = Modifier) {
    LayoutMinecraft(modifier)
}



@Preview(
    device = Devices.PIXEL
)

@Composable
fun LayoutMinecraft(modifier: Modifier = Modifier) {
    val linhas = listOf(
        listOf(Color.Red, Color.Red, Color.Red, Color.Green),
        listOf(Color.Red, Color.Red, Color.Blue, Color.Yellow),
        listOf(Color.Red, Color.Green, Color.Yellow, Color.Yellow),
        listOf(Color.Blue, Color.Yellow, Color.Yellow, Color.Yellow),
        listOf(Color.Green, Color.Green, Color.Red, Color.Yellow),
        listOf(Color.Green, Color.Green, Color.Green, Color.Blue)
    )

    Column(modifier = modifier.fillMaxSize()) {
        linhas.forEach { coresLinha ->
            Row(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)) {
                coresLinha.forEach { cor ->
                    Box(modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(cor))
                }
            }
        }
    }
}



