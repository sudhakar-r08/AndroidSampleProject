package com.sudhakar.cleanarchitecture.domain.usecase

import com.sudhakar.cleanarchitecture.domain.model.Country
import com.sudhakar.cleanarchitecture.domain.repository.CountriesRepository
import javax.inject.Inject

class GetCountriesUseCase @Inject constructor(private val repository:CountriesRepository){
    suspend operator fun invoke(): Result<List<Country>> {
        return repository.getAllCountries()
    }
}