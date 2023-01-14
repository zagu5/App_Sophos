package com.sophos.app_sophos.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DataSource {
    companion object{
        private const val BASE_URL = "https://6w33tkx4f9.execute-api.us-east-1.amazonaws.com/"
    }

    fun<Api> buildApi(
        api: Class<Api>
    ): Api {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)
    }
}