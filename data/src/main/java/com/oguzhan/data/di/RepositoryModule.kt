package com.oguzhan.data.di


import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler
import androidx.datastore.preferences.SharedPreferencesMigration
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStoreFile
import com.fordotosan.fordrewards.di.dispatchers.ApplicationScope
import com.oguzhan.core.di.dispatchers.Dispatcher
import com.oguzhan.core.di.dispatchers.PlantDispatchers
import com.oguzhan.data.remote.PlantApi
import com.oguzhan.data.repository.LocalStorageRepositoryImpl
import com.oguzhan.data.repository.PlantRepositoryImpl
import com.oguzhan.domain.repository.LocalStorageRepository
import com.oguzhan.domain.repository.PlantRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindPlantRepository(
        plantRepositoryImpl: PlantRepositoryImpl
    ): PlantRepository



    @Binds
    @Singleton
    abstract fun bindLocalStorageRepository(
        localStorageRepositoryImpl: LocalStorageRepositoryImpl
    ): LocalStorageRepository


}
