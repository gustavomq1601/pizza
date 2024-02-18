package com.pizza.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pizza.data.model.Cliente
import com.pizza.data.repository.ClienteRepository
import kotlinx.coroutines.launch

class ClienteViewModel(private val repository: ClienteRepository) : ViewModel() {

    fun getCliente(email: String): Cliente {
        return repository.getCliente(email)
    }

    fun saveCliente(cliente: Cliente) = viewModelScope.launch {
        repository.saveCliente(cliente)
    }
}
