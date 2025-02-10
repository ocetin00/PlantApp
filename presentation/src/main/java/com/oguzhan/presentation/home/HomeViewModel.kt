package com.oguzhan.presentation.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oguzhan.domain.repository.PlantRepository
import com.oguzhan.presentation.home.model.CategoryUiModel
import com.oguzhan.presentation.home.model.QuestionUiModel
import com.oguzhan.presentation.home.model.toUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class HomeState(
    val categoryList: List<CategoryUiModel?> = listOf(),
    val questionList: List<QuestionUiModel?> = listOf(),
    val error: String? = null
)

@HiltViewModel
class PlantViewModel @Inject constructor(private val plantRepository: PlantRepository) :
    ViewModel() {

    private val _state: MutableStateFlow<HomeState> = MutableStateFlow(HomeState())
    val state: StateFlow<HomeState> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            getCategories()
        }
        viewModelScope.launch {
            getQuestions()
        }
    }


    private fun getQuestions() {
        viewModelScope.launch {
            val result = plantRepository.fetchPlantsQuestions()
            result.onFailure {
                //show error in uı via state
                //TODO:("Not yet implemented")
            }.onSuccess {
                val result = result.getOrNull()
                result?.let {
                    _state.update { it.copy(questionList = result.toUiModel()) }
                }

            }
        }
    }

    private fun getCategories() {
        viewModelScope.launch {
            val result = plantRepository.fetchCategories()
            result.onFailure {
                //show error in uı via state
                //TODO:("Not yet implemented")
            }.onSuccess {
                val result = result.getOrNull()
                result?.let {
                    _state.update { it.copy(categoryList = result.toUiModel()) }
                }
            }
        }
    }

}