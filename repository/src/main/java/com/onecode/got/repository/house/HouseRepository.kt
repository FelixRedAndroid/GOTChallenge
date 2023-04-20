package com.onecode.got.repository.house

import androidx.paging.PagingData
import com.onecode.got.model.domain.DomainHouse
import com.onecode.got.repository.RepositoryResult
import kotlinx.coroutines.flow.Flow

interface HouseRepository {
    suspend fun fetchHouseById(id: Int): RepositoryResult<DomainHouse>
    fun getHouses(): Flow<PagingData<DomainHouse>>
}