package com.sudhakar.cleanarchitecture.presentation.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavOptionsBuilder
import com.google.gson.Gson
import com.sudhakar.cleanarchitecture.domain.model.Country

fun NavController.navigateToCountryDetails(
    country: Country,
    navOptions: NavOptionsBuilder.() -> Unit = {},
) {
    val countryJson = Gson().toJson(country)
    navigate(CountryDetailsRoute(country = countryJson)) {
        navOptions()
    }
}

fun NavController.navigateToCountriesList(popUoToRoute: Any? = null, inclusive: Boolean = false) {
    navigate(CountriesListRoute) {
        popUoToRoute?.let { route ->
            popUpTo(route) { this.inclusive = inclusive }
        }
    }
}