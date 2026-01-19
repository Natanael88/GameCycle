package com.example.gamecycle.model

data class UsuarioModel(val nombre : String = "",
                        val correo : String = "",
                        val clave : String = "",
                        val direccion : String = "",
                        val aceptaTerminos : Boolean = false,
                        val errores : UsuarioError = UsuarioError()
)
