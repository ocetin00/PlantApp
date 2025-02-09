package com.oguzhan.presentation.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import com.oguzhan.presentation.R
import com.oguzhan.presentation.databinding.FragmentOnboardingBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OnboardingFragmentFirst.newInstance] factory method to
 * create an instance of this fragment.
 */
class OnboardingFragmentFirst : Fragment() {
    private var _binding: FragmentOnboardingBinding? = null
    private val binding get() = _binding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController(this.requireView())
        binding.btnGetStarted.setOnClickListener {
            navController.navigate(R.id.action_onboarding_fragment_to_onboarding_fragment_second)
        }

    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            OnboardingFragmentFirst().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}