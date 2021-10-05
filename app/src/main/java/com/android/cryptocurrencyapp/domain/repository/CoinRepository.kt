package com.android.cryptocurrencyapp.domain.repository

import com.android.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.android.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}