package com.sudhakar.cleanarchitecture.presentation.ui.countries

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sudhakar.cleanarchitecture.domain.model.Country
import com.sudhakar.cleanarchitecture.domain.usecase.GetCountriesUseCase
import com.sudhakar.cleanarchitecture.presentation.ui.common.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CountriesViewModel @Inject constructor(private val getCountriesUseCase: GetCountriesUseCase) :
    ViewModel() {

    private val _uiState = MutableStateFlow<UiState<List<Country>>>(UiState.Loading)
    val uiState: StateFlow<UiState<List<Country>>> = _uiState.asStateFlow()

    init {
        loadCountries()
    }

    fun loadCountries() {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            getCountriesUseCase().fold(
                onSuccess = { countries ->
                    _uiState.value = UiState.Success(countries)
                },
                onFailure = { error ->
                    _uiState.value = UiState.Error(error.message ?: "Unknow Error")
                })
        }
    }
}