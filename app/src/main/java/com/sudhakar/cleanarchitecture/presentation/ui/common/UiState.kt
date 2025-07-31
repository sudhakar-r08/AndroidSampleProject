package com.sudhakar.cleanarchitecture.presentation.ui.common

// UiState.kt
sealed interface UiState<out T> {
    data object Loading : UiState<Nothing>
    data class Success<out T>(val data: T) : UiState<T>
    data class Error(val message: String) : UiState<Nothing>
}