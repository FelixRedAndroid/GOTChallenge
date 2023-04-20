package com.onecode.got.repository.house

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.onecode.got.datasource.DatasourceResult
import com.onecode.got.datasource.network.HouseNetworkDatasource
import com.onecode.got.model.toDomain
import com.onecode.got.repository.RepositoryResult
import javax.inject.Inject

internal class HouseRepositoryImpl @Inject constructor(
    private val networkDatasource: HouseNetworkDatasource
) : HouseRepository {

    override suspend fun fetchHouseById(id: Int) =
        when (val result = networkDatasource.fetchHouseById(id)) {
            is DatasourceResult.Success -> RepositoryResult.Success(result.data.toDomain())
            is DatasourceResult.Error -> RepositoryResult.Error(result.error)
        }

    override fun getHouses() = Pager(
        config = PagingConfig(pageSize = 25, prefetchDistance = 5),
        pagingSourceFactory = { HousesPagingSource(networkDatasource) }
    ).flow
}