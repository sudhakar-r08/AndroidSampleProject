package com.sudhakar.cleanarchitecture.data.remote.mapper

import com.sudhakar.cleanarchitecture.data.remote.dto.CountryDto
import com.sudhakar.cleanarchitecture.data.remote.dto.CurrencyDto
import com.sudhakar.cleanarchitecture.data.remote.dto.FlagsDto
import com.sudhakar.cleanarchitecture.data.remote.dto.LanguageDto
import com.sudhakar.cleanarchitecture.domain.model.Country
import com.sudhakar.cleanarchitecture.domain.model.Currency
import com.sudhakar.cleanarchitecture.domain.model.Language

fun CountryDto.toDomain(): Country {
    return Country(
        name = name,
        capital = capital,
        region = region,
        subregion = subregion,
        population = population,
        area = area,
        flag = flags?.toDomain(),
        alpha2Code = alpha2Code,
        currencies = currencies?.map { it.toDomain() },
        languages = languages?.map { it.toDomain() }
    )
}

fun CurrencyDto.toDomain(): Currency {
    return Currency(
        code = code,
        name = name,
        symbol = symbol
    )
}

fun LanguageDto.toDomain(): Language {
    return Language(
        iso639_1 = iso639_1,
        iso639_2 = iso639_2,
        name = name,
        nativeName = nativeName
    )
}

fun FlagsDto.toDomain(): String{
    return png
}