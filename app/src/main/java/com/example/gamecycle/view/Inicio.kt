package com.example.gamecycle.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.gamecycle.R
import androidx.navigation.NavController

@Composable
fun homeScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "GAME CYCLE", fontWeight = FontWeight.Bold)


        Image(
            painter = painterResource(id = R.drawable.glogo),
            "Logo App",
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentScale = ContentScale.Fit

        )


        Button(onClick = {navController.navigate("Login")},
            colors = ButtonDefaults.buttonColors(
                Color.Blue,
                Color.White,
            ), modifier = Modifier.padding(40.dp)
        ) {
            Text("Iniciar", modifier = Modifier.size(100.dp,20.dp).offset(30.dp))
        }

        Button(onClick = {navController.navigate("Registro")},
            colors = ButtonDefaults.buttonColors(
                Color.Blue,
                Color.White
            )

        ) {
            Text("Registrar", modifier = Modifier.size(100.dp,20.dp).offset(30.dp))
        }

    }
}