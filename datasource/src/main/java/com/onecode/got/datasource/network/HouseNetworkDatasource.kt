package com.onecode.got.datasource.network

import com.onecode.got.datasource.DatasourceResult
import com.onecode.got.model.api.ApiHouse
import com.onecode.got.model.domain.DomainHouse

interface HouseNetworkDatasource {
    suspend fun fetchHousesByPage(page: Int): DatasourceResult<List<ApiHouse>>
    suspend fun fetchHouseById(id: Int): DatasourceResult<ApiHouse>
}