package com.example.pawller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavHostController
import com.example.pawller.ui.theme.PawllerTheme
import com.example.pawller.ui.viewmodels.DogViewModel
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import org.koin.androidx.viewmodel.ext.android.viewModel

@OptIn(ExperimentalAnimationApi::class)
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    private val viewModel by viewModel<DogViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PawllerTheme {
                navController = rememberAnimatedNavController()
            }
        }
    }
}
