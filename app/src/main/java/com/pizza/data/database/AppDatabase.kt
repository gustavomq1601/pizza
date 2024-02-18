package com.pizza.data.database

import ClienteDao
import androidx.room.Database
import androidx.room.RoomDatabase
import com.pizza.data.model.Cliente

@Database(entities = [Cliente::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun clienteDao(): ClienteDao
}