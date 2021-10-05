package com.android.cryptocurrencyapp.presentation.coin_details

import com.android.cryptocurrencyapp.domain.model.Coin
import com.android.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
