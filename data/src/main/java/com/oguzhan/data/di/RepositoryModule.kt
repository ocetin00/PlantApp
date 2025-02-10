package com.oguzhan.data.di


import com.oguzhan.data.repository.LocalStorageRepositoryImpl
import com.oguzhan.data.repository.PlantRepositoryImpl
import com.oguzhan.domain.repository.LocalStorageRepository
import com.oguzhan.domain.repository.PlantRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
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
