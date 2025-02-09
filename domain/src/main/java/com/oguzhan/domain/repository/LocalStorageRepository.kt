package com.oguzhan.domain.repository

interface LocalStorageRepository {
    suspend fun putBool(key: String, value: Boolean)
    suspend fun getBool(key: String): Boolean?
}