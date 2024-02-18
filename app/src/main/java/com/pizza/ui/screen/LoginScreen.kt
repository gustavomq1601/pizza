package com.pizza.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.pizza.data.dao.test.ClienteDaoTest
import com.pizza.data.repository.ClienteRepository
import com.pizza.ui.viewmodel.ClienteViewModel

@Composable
fun LoginScreen(navController: NavController, clienteViewModel: ClienteViewModel = viewModel()) {    val email = remember { mutableStateOf("") }
    val contrasena = remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Login\nBienvenido de nuevo",
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )
        OutlinedTextField(
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        )
        OutlinedTextField(
            value = contrasena.value,
            onValueChange = { contrasena.value = it },
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
            onClick = {
                val cliente = clienteViewModel.getCliente(email.value)
                if (cliente.contrasena == contrasena.value) {
                    // El inicio de sesión es exitoso
                } else {
                    // La contraseña es incorrecta, redirige a la pantalla de registro
                    navController.navigate("signin")
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        ) {
            Text("Login")
        }
        Row(
            modifier = Modifier.padding(top = 8.dp, start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "No tiene cuenta",
                color = Color.Gray
            )

            Spacer(modifier = Modifier.width(16.dp)) // Espacio de 16dp entre Text y ClickableText

            ClickableText(
                text = AnnotatedString("Alta usuario"),
                style = TextStyle(color = MaterialTheme.colorScheme.primary), // Cambiar al color de los botones
                onClick = { offset -> navController.navigate("signin") }
            )
        }

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
    val clienteDaoTest = ClienteDaoTest()
    val clienteRepository = ClienteRepository(clienteDao = clienteDaoTest)
    val clienteViewModel = ClienteViewModel(repository = clienteRepository)
    val navController = rememberNavController()
    LoginScreen(clienteViewModel = clienteViewModel, navController = navController)
}


