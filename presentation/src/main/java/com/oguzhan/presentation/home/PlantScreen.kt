package com.oguzhan.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun PlantScreen(
    modifier: Modifier = Modifier,
    viewModel: PlantViewModel = hiltViewModel(),
) {

    Column(modifier = modifier) {
        Text("Plant Screen")
    }

}