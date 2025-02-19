package com.example.botaoflutuante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.botaoflutuante.ui.theme.BotaoFlutuanteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BotaoFlutuanteTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    floatingActionButton = {
                        CriarBotaoPadraoFlutuante {}
                    }
                ) { innerPadding ->
                    // Organizando a exibição dos botões flutuantes
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CriarBotaoPequenoFlutuante {}
                        Spacer(modifier = Modifier.height(16.dp))
                        CriarBotaoGrandeFlutuante {}
                        Spacer(modifier = Modifier.height(16.dp))
                        CriarBotaoExtendidoFlutuante {}
                    }
                }
            }
        }
    }
}

// Botão de ação flutuante padrão
@Composable
fun CriarBotaoPadraoFlutuante(onClick: () -> Unit) {
    FloatingActionButton(
        onClick = onClick,
        containerColor = Color(0xFF2196F3),
        contentColor = Color.White
    ) {
        Icon(Icons.Filled.Add, contentDescription = "Adicionar")
    }
}

// Botão de ação flutuante pequeno
@Composable
fun CriarBotaoPequenoFlutuante(onClick: () -> Unit) {
    SmallFloatingActionButton(
        onClick = onClick,
        containerColor = Color(0xFF03DAC5),
        contentColor = Color.Black
    ) {
        Icon(Icons.Filled.Add, contentDescription = "Adicionar pequeno")
    }
}

// Botão de ação flutuante grande
@Composable
fun CriarBotaoGrandeFlutuante(onClick: () -> Unit) {
    LargeFloatingActionButton(
        onClick = onClick,
        shape = CircleShape,
        containerColor = Color(0xFFFF5722),
        contentColor = Color.White
    ) {
        Icon(Icons.Filled.Add, contentDescription = "Adicionar grande")
    }
}

// Botão de ação flutuante estendido
@Composable
fun CriarBotaoExtendidoFlutuante(onClick: () -> Unit) {
    ExtendedFloatingActionButton(
        onClick = onClick,
        icon = { Icon(Icons.Filled.Edit, contentDescription = "Editar") },
        text = { Text(text = "Editar tarefa") },
        containerColor = Color(0xFFBB86FC),
        contentColor = Color.Black
    )
}

// Preview com todos os botões flutuantes
@Preview(showBackground = true)
@Composable
fun ExibirBotoesFlutuantes() {
    BotaoFlutuanteTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CriarBotaoPequenoFlutuante {}
            Spacer(modifier = Modifier.height(16.dp))
            CriarBotaoGrandeFlutuante {}
            Spacer(modifier = Modifier.height(16.dp))
            CriarBotaoExtendidoFlutuante {}
        }
    }
}
