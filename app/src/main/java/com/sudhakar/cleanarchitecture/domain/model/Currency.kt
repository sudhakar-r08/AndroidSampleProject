package com.sudhakar.cleanarchitecture.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Currency(
    val code: String?,
    val name: String?,
    val symbol: String?
)