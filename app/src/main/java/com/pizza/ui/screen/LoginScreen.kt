package com.pizza.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Login\nBienvenido de nuevo",
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Contraseña") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        )
        Text(
            text = "¿Olvidó su clave?",
            color = Color.Gray,
            modifier = Modifier.padding(top = 8.dp, start = 16.dp, end = 16.dp)
        )
        Button(
            onClick = {}, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        ) {
            Text("Login")
        }
        Text(
            text = "No tiene cuenta Alta usuario",
            color = Color.Gray,
            modifier = Modifier.padding(top = 8.dp, start = 16.dp, end = 16.dp)
        )
        Divider(modifier = Modifier.padding(top = 16.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        ) {
            Text("Login con Facebook")
        }
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        ) {
            Text("Login con Google")
        }
        Text(
            text = "Llámame abc@gmail.com",
            color = Color.Gray,
            modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)
        )
    }
}

@Preview
@Composable
fun PreviewLogin() {
    LoginScreen()
}
