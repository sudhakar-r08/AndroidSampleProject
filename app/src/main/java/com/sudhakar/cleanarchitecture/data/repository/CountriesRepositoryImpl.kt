package com.sudhakar.cleanarchitecture.data.repository

import com.sudhakar.cleanarchitecture.data.remote.api.CountriesApi
import com.sudhakar.cleanarchitecture.data.remote.mapper.toDomain
import com.sudhakar.cleanarchitecture.domain.model.Country
import com.sudhakar.cleanarchitecture.domain.repository.CountriesRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CountriesRepositoryImpl @Inject constructor(
    private val api: CountriesApi
) : CountriesRepository {

    override suspend fun getAllCountries(): Result<List<Country>> {
        return try {
            val fields = "name,alpha2Code,currencies,languages,population,region,subregion,capital,area,flags"
            val countries = api.getAllCountries(fields).map { it.toDomain() }
            Result.success(countries)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}