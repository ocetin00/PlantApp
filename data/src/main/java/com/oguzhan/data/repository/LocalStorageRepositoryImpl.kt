package com.oguzhan.data.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import com.oguzhan.domain.repository.LocalStorageRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.first

class LocalStorageRepositoryImpl @Inject constructor(
    private val preferences: DataStore<Preferences>,
) : LocalStorageRepository {
    override suspend fun putBool(key: String, value: Boolean) {
        val preferencesKey = booleanPreferencesKey(key)
        preferences.edit { preferences ->
            preferences[preferencesKey] = value
        }
    }

    override suspend fun getBool(key: String): Boolean? {
        return try {
            val preferencesKey = booleanPreferencesKey(key)
            val preferences = preferences.data.first()
            preferences[preferencesKey]
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}