package com.pizza.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Cliente(
    @PrimaryKey val email: String,
    val nombre: String,
    val telefono: String,
    val contrasena: String
)
