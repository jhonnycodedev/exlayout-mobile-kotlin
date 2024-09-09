package br.edu.up.exlayout

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.edu.up.exlayout.ui.screen.HomeScreen
import br.edu.up.exlayout.ui.screen.SegundaScreen
import br.edu.up.exlayout.ui.screen.TerceiraScreen
import br.edu.up.exlayout.ui.screen.QuartoScreen

@Preview
@Composable
fun MeuApp(){
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        val padding = Modifier.padding(innerPadding)
        val tela = 2
        when(tela){
            1 -> HomeScreen(padding)
            2 -> SegundaScreen(padding)
            3 -> TerceiraScreen(padding)
            4 -> QuartoScreen(padding)
        }
    }
}