package com.example.gamecycle.repository

import com.example.gamecycle.model.UsuarioDao
import com.example.gamecycle.model.UsuarioDb

class UsuarioRepository(private val dao: UsuarioDao) {
    suspend fun obtenerUsuarios(): List<UsuarioDb> = dao.obtenerUsuarios()
    suspend fun insertar(usuario: UsuarioDb) = dao.insertar(usuario)
    suspend fun eliminar(usuario: UsuarioDb) = dao.eliminar(usuario)
}