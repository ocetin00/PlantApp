package com.oguzhan.presentation.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oguzhan.core.constant.LocalStoreKeys
import com.oguzhan.domain.repository.LocalStorageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class OnboardingFirstViewModel @Inject constructor(private val localStorageRepository: LocalStorageRepository) :
    ViewModel() {

    private val _state: MutableStateFlow<Boolean> = MutableStateFlow(false)
    val state: StateFlow<Boolean> = _state.asStateFlow()

    init {
        checkOnboardingStatus()
    }

    fun checkOnboardingStatus() {
        viewModelScope.launch {
            val result = localStorageRepository.getBool(LocalStoreKeys.IS_ONBOARDING_COMPLETED)
            if (result != null) {
                _state.value = result
            }
        }
    }

}