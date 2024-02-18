package com.pizza.data.repository

import ClienteDao
import com.pizza.data.model.Cliente

class ClienteRepository(private val clienteDao: ClienteDao) {

    fun getCliente(email: String): Cliente {
        return clienteDao.getCliente(email)
    }

    suspend fun saveCliente(cliente: Cliente) {
        clienteDao.saveCliente(cliente)
    }
}
