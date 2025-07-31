package com.sudhakar.cleanarchitecture.presentation.ui.navigation

import com.sudhakar.cleanarchitecture.domain.model.Country
import kotlinx.serialization.Serializable

@Serializable
object CountriesListRoute

@Serializable
data class CountryDetailsRoute(val country: String)