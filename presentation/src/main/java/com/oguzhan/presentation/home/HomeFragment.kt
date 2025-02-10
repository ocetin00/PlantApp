package com.oguzhan.presentation.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.oguzhan.presentation.R
import com.oguzhan.presentation.databinding.FragmentHomeBinding
import com.oguzhan.presentation.home.util.CategoryAdapter
import com.oguzhan.presentation.home.util.QuestionAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


@AndroidEntryPoint
class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var questionAdapter: QuestionAdapter
    private val viewModel: PlantViewModel by viewModels<PlantViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        questionAdapter = QuestionAdapter()
        categoryAdapter = CategoryAdapter()
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.state.collectLatest {
                    it.questionList.forEach {
                        Log.d("HomeFragment", it.toString())
                    }
                    questionAdapter.updateData(it.questionList.filterNotNull())
                    categoryAdapter.updateData(it.categoryList.filterNotNull())
                }
            }
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerViewQuestins.adapter = questionAdapter

        binding.recyclerViewCategories.apply {
            layoutManager = GridLayoutManager(this@HomeFragment.requireContext(), 2)
            adapter = categoryAdapter
            isNestedScrollingEnabled = false
        }

    }
}