package com.pizza.data.dao.test

import ClienteDao
import com.pizza.data.model.Cliente

class ClienteDaoTest : ClienteDao {
    override fun getCliente(email: String): Cliente {
        // Devuelve un cliente de prueba
        return Cliente("email@example.com", "Nombre Ejemplo", "1234567890", "contraseña")
    }

    override fun saveCliente(cliente: Cliente) {
        // No hace nada
    }
}