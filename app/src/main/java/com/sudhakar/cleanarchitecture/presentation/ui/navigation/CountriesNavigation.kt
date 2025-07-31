package com.sudhakar.cleanarchitecture.presentation.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.google.gson.Gson
import com.sudhakar.cleanarchitecture.domain.model.Country
import com.sudhakar.cleanarchitecture.presentation.ui.countries.CountriesScreen
import com.sudhakar.cleanarchitecture.presentation.ui.details.CountryDetailsScreen

@Composable
fun CountriesNavigation(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = CountriesListRoute) {
        composable<CountriesListRoute> {
            CountriesScreen(
                onCountyClick = { country ->
                    val countryJson = Gson().toJson(country)
                    navController.navigate(CountryDetailsRoute(country = countryJson))
                })
        }
        composable<CountryDetailsRoute> { backStackEntry ->

            val countryDetailsRoute = backStackEntry.toRoute<CountryDetailsRoute>()
            val countryData = Gson().fromJson(countryDetailsRoute.country, Country::class.java)
            CountryDetailsScreen(
                country = countryData,
                onBackClick = { navController.popBackStack() })
        }
    }
}