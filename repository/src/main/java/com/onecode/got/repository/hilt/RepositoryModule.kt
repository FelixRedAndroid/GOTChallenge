package com.onecode.got.repository.hilt

import com.onecode.got.repository.house.HouseRepository
import com.onecode.got.repository.house.HouseRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindHouseRepository(houseRepositoryImpl: HouseRepositoryImpl): HouseRepository
}