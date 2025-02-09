package com.oguzhan.presentation.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oguzhan.domain.repository.PlantRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class PlantViewModel @Inject constructor(private val plantRepository: PlantRepository) :
    ViewModel() {

    init {
    }


    fun getQuestions() {
        viewModelScope.launch {
            val result = plantRepository.fetchPlantsQuestions()
            result.onFailure {
                Log.d("PlantViewModel", result.getOrNull().toString())
            }.onSuccess {
                Log.d("PlantViewModel", result.getOrNull().toString())
            }
        }
    }

    fun getCategories() {
        viewModelScope.launch {
            val result = plantRepository.fetchCategories()
            result.onFailure {
                Log.d("PlantViewModel", result.getOrNull().toString())
            }.onSuccess {
                Log.d("PlantViewModel", result.getOrNull().toString())
            }
        }
    }

}