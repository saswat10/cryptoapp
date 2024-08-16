package com.example.cryptoapp.domain.models


// this model will help in display the data
// will be used in ui
data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
