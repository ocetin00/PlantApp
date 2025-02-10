package com.oguzhan.presentation.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oguzhan.core.constant.LocalStoreKeys
import com.oguzhan.domain.repository.LocalStorageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class PaywallViewModel @Inject constructor(private val localStorageRepository: LocalStorageRepository) :
    ViewModel() {

    fun saveOnboardingStatus() {
        viewModelScope.launch(NonCancellable) {
            localStorageRepository.putBool(LocalStoreKeys.IS_ONBOARDING_COMPLETED, true)
        }
    }


}