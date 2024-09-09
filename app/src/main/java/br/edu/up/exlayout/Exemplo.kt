package br.edu.up.exlayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(
    device = Devices.PIXEL
)
@Composable
fun LayoutHorizontal(){
    val fontSize = 50.sp
    val modifierTxt = Modifier.padding(10.dp)
        .background(Color.White)
        .padding(10.dp)

    Column (modifier = Modifier.fillMaxSize()) {
        Row (modifier = Modifier.fillMaxWidth()
            .weight(1f)
            .background(Color(0xFF44FF55)),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "A",
                fontSize = fontSize,
                modifier = modifierTxt)
            Text(text = "B",
                fontSize = fontSize,
                modifier = modifierTxt)
            Text(text = "C",
                fontSize = fontSize,
                modifier = modifierTxt)
        }
        Row (modifier = Modifier.fillMaxWidth()
            .weight(3f)
            .background(Color(0xFFBD8DD9))){
            Text(text = "Linha 2",
                fontSize = fontSize)
        }
        Row (modifier = Modifier.fillMaxWidth()
            .weight(1f)
            .background(Color(0xFFFFEB3B))){
            Text(text = "Linha 3",
                fontSize = fontSize)
        }
    }


}