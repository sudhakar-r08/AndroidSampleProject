package com.sudhakar.cleanarchitecture.data.remote.dto

data class CountryDto(
    val name: String,
    val capital: String?,
    val region: String,
    val subregion: String?,
    val population: Long,
    val area: Double?,
    val flags: FlagsDto?,
    val alpha2Code: String,
    val currencies: List<CurrencyDto>?,
    val languages: List<LanguageDto>?
)
