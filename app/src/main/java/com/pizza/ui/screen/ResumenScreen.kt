package com.pizza.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResumenScreen() {
    val ingredientesSeleccionados = listOf("atún", "pepperoni")
    val numeroIngredientes = ingredientesSeleccionados.size
    val tipoMasa = "fina"
    val precioBase = 5.0
    val precioIngrediente = 1.5
    val precioTotal = precioBase + numeroIngredientes * precioIngrediente
    val cliente = "Pepe"

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Resumen de compra",
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "Num Ingredientes: $numeroIngredientes",
            style = TextStyle(fontSize = 18.sp),
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(top = 16.dp, start = 16.dp)
        )
        Text(
            text = "Tipo de masa: $tipoMasa",
            style = TextStyle(fontSize = 18.sp),
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(top = 16.dp, start = 16.dp)
        )
        Text(
            text = "Precio final: $precioTotal €",
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(top = 16.dp, start = 16.dp)
        )
        Text(
            text = "Cliente: $cliente",
            style = TextStyle(fontSize = 18.sp),
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(top = 16.dp, start = 16.dp)
        )
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        ) {
            Text("Pagar")
        }
    }
}

@Preview
@Composable
fun PreviewResumen() {
    ResumenScreen()
}
