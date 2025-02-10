package com.oguzhan.domain.repository

import com.oguzhan.domain.model.CategoryDomainModel
import com.oguzhan.domain.model.QuestionDomainModel

interface PlantRepository {
    suspend fun fetchCategories(): Result<CategoryDomainModel>
    suspend fun fetchPlantsQuestions(): Result<List<QuestionDomainModel>>
}