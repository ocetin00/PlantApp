package com.oguzhan.data.remote

import com.oguzhan.data.remote.model.Category
import com.oguzhan.data.remote.model.Question
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.GET

const val PlanCategory = "/getCategories"
const val Questions = "/getQuestions"

interface PlantApi {
    @GET(PlanCategory)
    suspend fun getCategories(): ApiResponse<Category>

    @GET(Questions)
    suspend fun getQuestions(): ApiResponse<List<Question>>
}