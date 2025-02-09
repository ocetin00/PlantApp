package com.oguzhan.data.mapper

import com.skydoves.sandwich.ApiResponse

/*
internal fun <T, R> ApiResponse<T>.toResult(mapper: (T) -> R): Result<R> {
    return when (this) {
        is ApiResponse.Success -> {
            Result.Success(mapper.invoke(this.data))
        }

        is ApiResponse.Failure.Error -> {
            Result.Error(this.code, this.message())
        }

        is ApiResponse.Failure.Exception -> {
            Result.Exception(this.message())
        }

        else -> {}
    }
}*/
