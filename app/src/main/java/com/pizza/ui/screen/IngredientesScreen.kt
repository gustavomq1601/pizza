package com.pizza.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("MutableCollectionMutableState")
@Composable
fun IngredientesScreen() {
    val ingredientes = listOf("mozzarella", "salami", "atún", "pepperoni", "champiñones")
    val seleccionados = remember { mutableStateOf(mutableListOf<String>()) }

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Número de ingredientes: ${seleccionados.value.size}",
            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )
        ingredientes.forEach { ingrediente ->
            val isChecked = remember { mutableStateOf(false) }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 16.dp, end = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isChecked.value, onCheckedChange = { checked ->
                        isChecked.value = checked
                        if (checked) {
                            seleccionados.value.add(ingrediente)
                        } else {
                            seleccionados.value.remove(ingrediente)
                        }
                    }
                )
                Text(ingrediente)
            }
        }
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        ) {
            Text("Siguiente (pagar)")
        }
    }
}

@Preview
@Composable
fun PreviewIngredientes() {
    IngredientesScreen()
}
