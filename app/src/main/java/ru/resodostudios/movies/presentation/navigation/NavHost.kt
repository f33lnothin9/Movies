package ru.resodostudios.movies.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.resodostudios.movies.presentation.screens.MainScreen
import ru.resodostudios.movies.presentation.screens.MovieScreen
import ru.resodostudios.movies.presentation.screens.splash.SplashScreen

@Composable
fun NavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route
    ) {
        composable(route = Screens.Splash.route) {
            SplashScreen(navController)
        }

        composable(route = Screens.Main.route) {
            MainScreen()
        }

        composable(route = Screens.Movie.route) {
            MovieScreen()
        }
    }
}