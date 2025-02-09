package com.oguzhan.data.repository

import com.oguzhan.data.mapper.toDomainModel
import com.oguzhan.data.remote.PlantApi
import com.oguzhan.domain.model.CategoryDomainModel
import com.oguzhan.domain.model.QuestionDomainModel
import com.oguzhan.domain.repository.PlantRepository
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.messageOrNull
import javax.inject.Inject

class PlantRepositoryImpl @Inject constructor(private val plantApi: PlantApi) : PlantRepository {
    override suspend fun fetchCategories(): Result<CategoryDomainModel> {
        return when (val apiResult = plantApi.getCategories()) {
            is ApiResponse.Success -> {
                Result.success(apiResult.data.toDomainModel())
            }

            else -> {
                Result.failure(Exception(apiResult.messageOrNull ?: "An error occurred"))
            }
        }
    }

    override suspend fun fetchPlantsQuestions(): Result<QuestionDomainModel> {
        return when (val apiResult = plantApi.getQuestions()) {
            is ApiResponse.Success -> {
                Result.success(apiResult.data.toDomainModel())
            }

            else -> {
                Result.failure(Exception(apiResult.messageOrNull ?: "An error occurred"))
            }
        }
    }
}