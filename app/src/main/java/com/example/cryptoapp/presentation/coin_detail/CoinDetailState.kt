package com.example.cryptoapp.presentation.coin_detail

import androidx.annotation.Nullable
import com.example.cryptoapp.domain.models.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin : CoinDetail? = null,
    val error: String = ""
)
