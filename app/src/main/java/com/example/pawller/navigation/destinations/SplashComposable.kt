package com.example.pawller.navigation.destinations

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideOutVertically
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.example.pawller.utils.Constants.SPLASH_SCREEN
import com.google.accompanist.navigation.animation.composable

@ExperimentalAnimationApi
@Composable
fun SplashScreen(navController: NavController) {
    fun NavGraphBuilder.splashComposable(
        navigateToListScreen: () -> Unit,
    ) {
        composable(
            route = SPLASH_SCREEN,
            exitTransition = {
                slideOutVertically(
                    targetOffsetY = { fullHeight -> -fullHeight },
                    animationSpec = tween(durationMillis = 300)
                )
            }
        ) {
            //SplashScreen(navigateToListScreen = navigateToListScreen)
        }
    }
}