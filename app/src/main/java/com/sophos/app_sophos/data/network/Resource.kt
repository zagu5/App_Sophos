package com.sophos.app_sophos.data.network

import okhttp3.ResponseBody

sealed class Resource<out T> {
    data class Succes<out T>(val value:T) : Resource<T>()
    data class Failure(
        val isNetworkError: Boolean,
        val errorCode: Int?,
        val errorBOdy: ResponseBody
    )
}
