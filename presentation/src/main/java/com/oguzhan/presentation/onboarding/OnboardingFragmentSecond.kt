package com.oguzhan.presentation.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import com.oguzhan.presentation.R
import com.oguzhan.presentation.databinding.FragmentOnboardingBinding
import com.oguzhan.presentation.databinding.FragmentOnboardingSecondBinding


class OnboardingFragmentSecond : Fragment() {

    private var _binding: FragmentOnboardingSecondBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboardingSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController(this.requireView())
        binding.btnNext.setOnClickListener {
            navController.navigate(R.id.action_onboarding_fragment_second_to_onboarding_fragment_third)
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}