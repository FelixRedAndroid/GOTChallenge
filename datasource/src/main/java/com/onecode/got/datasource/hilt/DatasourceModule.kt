package com.onecode.got.datasource.hilt

import com.onecode.got.datasource.network.HouseNetworkDatasource
import com.onecode.got.datasource.network.HouseNetworkDatasourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DatasourceModule {

    @Singleton
    @Binds
    abstract fun bindHouseNetworkDatasource(houseNetworkDatasourceImpl: HouseNetworkDatasourceImpl): HouseNetworkDatasource
}