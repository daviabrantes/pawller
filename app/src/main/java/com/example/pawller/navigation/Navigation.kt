package com.example.pawller.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {

//        composable(route = Screen.Splash.route) {
//            SplashScreen(navController = navController)
//        }
//        composable(route = Screen.Home.route) {
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.White),
//                contentAlignment = Alignment.Center
//            ) {
//                Text(text = "Hello World", color = Color.Black)
//            }
//        }
//    }
    }
}