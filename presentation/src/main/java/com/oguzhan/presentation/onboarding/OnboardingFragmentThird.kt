package com.oguzhan.presentation.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import com.oguzhan.presentation.R
import com.oguzhan.presentation.databinding.FragmentOnboardingSecondBinding
import com.oguzhan.presentation.databinding.FragmentOnboardingThirdBinding


class OnboardingFragmentThird : Fragment() {
    private var _binding: FragmentOnboardingThirdBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboardingThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController(this.requireView())
        binding.btnNext.setOnClickListener {
            navController.navigate(R.id.action_onboarding_fragment_third_to_onboarding_fragment_paywall)
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}