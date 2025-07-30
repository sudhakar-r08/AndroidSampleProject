package com.sudhakar.cleanarchitecture.data.di

import com.sudhakar.cleanarchitecture.data.repository.CountriesRepositoryImpl
import com.sudhakar.cleanarchitecture.domain.repository.CountriesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindCountriesRepository(countriesRepositoryImpl: CountriesRepositoryImpl): CountriesRepository
}