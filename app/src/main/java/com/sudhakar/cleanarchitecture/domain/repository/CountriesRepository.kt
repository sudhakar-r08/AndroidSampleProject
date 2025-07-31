package com.sudhakar.cleanarchitecture.domain.repository

import com.sudhakar.cleanarchitecture.domain.model.Country

interface CountriesRepository {
    suspend fun getAllCountries(): Result<List<Country>>
}