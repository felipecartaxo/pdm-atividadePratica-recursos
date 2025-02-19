package com.example.botoes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.botoes.ui.theme.BotoesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BotoesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Organizando os botões na tela
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CriarBotaoSolido(
                            texto = "Sólido",
                            onClick = {},
                            modifier = Modifier.padding(8.dp)
                        )
                        CriarBotaoTonalidadePreenchida(
                            texto = "Tonal",
                            onClick = {},
                            modifier = Modifier.padding(8.dp)
                        )
                        CriarBotaoElevado(
                            texto = "Delineado",
                            onClick = {},
                            modifier = Modifier.padding(8.dp)
                        )
                        CriarBotaoDelineado(
                            texto = "Elevado",
                            onClick = {},
                            modifier = Modifier.padding(8.dp)
                        )
                        CriarBotaoDeTexto(
                            texto = "de Texto",
                            onClick = {},
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        }
    }
}

// Implementação do botão filled
@Composable
fun CriarBotaoSolido(texto: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        modifier = modifier.width(200.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF7D50C9),
            contentColor = Color.White
        )
    ) {
        Text(text = "Botão $texto")
    }
}

// Implementação do botão tonal
@Composable
fun CriarBotaoTonalidadePreenchida(texto: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    FilledTonalButton(
        onClick = onClick,
        modifier = modifier.width(200.dp),
        colors = ButtonDefaults.filledTonalButtonColors(
            containerColor = Color.Cyan,
            contentColor = Color.Black
        )
    ) {
        Text(text = "Botão $texto")
    }
}

// Implementação do botão outlined
@Composable
fun CriarBotaoElevado(texto: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier.width(200.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = Color.Black,
            containerColor = Color.White
        )
    ) {
        Text(text = "Botão $texto")
    }
}

// Implementação do botão elevated
@Composable
fun CriarBotaoDelineado(texto: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    ElevatedButton(
        onClick = onClick,
        modifier = modifier.width(200.dp),
        colors = ButtonDefaults.elevatedButtonColors(
            contentColor = Color.Black,
            containerColor = Color.Gray
        )
    ) {
        Text(text = "Botão $texto")
    }
}

// Implementação do botão de texto
@Composable
fun CriarBotaoDeTexto(texto: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    TextButton(
        onClick = onClick,
        modifier = modifier.width(200.dp),
        colors = ButtonDefaults.textButtonColors(
            contentColor = Color.Blue,
            containerColor = Color.LightGray
        )
    ) {
        Text(text = "Botão $texto")
    }
}

// Preview do layout com os botões
@Preview(showBackground = true)
@Composable
fun PreviewBotoes() {
    BotoesTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CriarBotaoSolido(texto = "Sólido", onClick = {})
            CriarBotaoTonalidadePreenchida(texto = "Tonal", onClick = {})
            CriarBotaoElevado(texto = "Delineado", onClick = {})
            CriarBotaoDelineado(texto = "Elevado", onClick = {})
            CriarBotaoDeTexto(texto = "de Texto", onClick = {})
        }
    }
}
