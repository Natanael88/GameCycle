package com.example.gamecycle.model
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "usuarios")
data class UsuarioDb(@PrimaryKey(autoGenerate = true) val id: Int = 0, val nombre: String, val correo: String,
    val clave: String, val direccion: String, val aceptaTerminos: Boolean
)
