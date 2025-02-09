package com.oguzhan.presentation.onboarding

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oguzhan.core.constant.LocalStoreKeys
import com.oguzhan.domain.repository.LocalStorageRepository
import com.oguzhan.domain.repository.PlantRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class OnboardingViewModel @Inject constructor(private val localStorageRepository: LocalStorageRepository) :
    ViewModel() {

    fun saveOnboardingStatus() {
        viewModelScope.launch {
            localStorageRepository.putBool(LocalStoreKeys.IS_ONBOARDING_COMPLETED, true)
        }
    }

}