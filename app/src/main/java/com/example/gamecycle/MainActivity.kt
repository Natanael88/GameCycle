package com.example.gamecycle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gamecycle.model.AppDatabase
import com.example.gamecycle.repository.UsuarioRepository
import com.example.gamecycle.view.Registro
import com.example.gamecycle.view.ResumenScreen
import com.example.gamecycle.view.homeScreen
import com.example.gamecycle.viewmodel.UsuarioViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val context = LocalContext.current
            val db =remember { AppDatabase.getDatabase(context) }
            val repository = remember { UsuarioRepository(db.usuarioDao()) }
            val usuarioViewModel = remember { UsuarioViewModel(repository)}


            NavHost (navController=navController,startDestination="Inicio"){
                composable("Inicio"){
                    homeScreen(navController)
                }
                composable("Registro"){
                    Registro(navController,usuarioViewModel)
                }
                composable("Login"){
                    ResumenScreen(usuarioViewModel,navController)

                }
            }

        }
    }
}