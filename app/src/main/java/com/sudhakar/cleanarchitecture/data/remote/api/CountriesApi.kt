package com.sudhakar.cleanarchitecture.data.remote.api

import com.sudhakar.cleanarchitecture.data.remote.dto.CountryDto
import retrofit2.http.GET
import retrofit2.http.Query

interface CountriesApi {
    @GET("v2/all")
    suspend fun getAllCountries(@Query("fields") fields: String): List<CountryDto>
}