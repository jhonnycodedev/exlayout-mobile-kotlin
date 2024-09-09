package br.edu.up.exlayout.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.edu.up.exlayout.ui.theme.corTopBar

@Preview
@Composable
fun QuartoScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { Footer() }
    ) { innerPadding ->
        LayoutHomeContent(modifier.padding(innerPadding))
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        title = { Text("Teste de Aula") },
        navigationIcon = {
            IconButton(onClick = { /* TODO: Handle navigation icon click */ }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
            }
        },
        actions = {
            IconButton(onClick = { /* TODO: Handle action icon click */ }) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = corTopBar,
            titleContentColor = Color.White
        ),
        modifier = Modifier.background(Color.Blue)
    )
}

@Composable
fun Footer() {
    BottomAppBar(
        content = {
            Text(
                text = "Footer Content",
                modifier = Modifier.padding(16.dp),
                color = Color.White
            )
        }
    )
}

@Composable
fun LayoutHomeContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .background(Color.Red)
                    .fillMaxHeight()
                    .weight(1f)
            )
            Box(
                modifier = Modifier
                    .background(Color.Yellow)
                    .fillMaxHeight()
                    .weight(1f)
            )
        }
    }
}

@Preview(
    device = Devices.PIXEL
)
@Composable
fun PreviewQuartoScreen() {
    QuartoScreen()
}
