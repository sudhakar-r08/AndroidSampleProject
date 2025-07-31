package com.sudhakar.cleanarchitecture.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Country(
    val name: String,
    val capital: String?,
    val region: String,
    val subregion: String?,
    val population: Long,
    val area: Double?,
    val flag: String?,
    val alpha2Code: String,
    val currencies: List<Currency>?,
    val languages: List<Language>?
)
