package com.example.feature_profile.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.common.navigation.base.BaseNavigator
import com.example.feature_profile.viewmodel.ProfileViewModel

@Composable
fun ProfileLandingScreen(
    navigator: BaseNavigator,
    viewModel: ProfileViewModel = hiltViewModel()
) = with(viewModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = args.nama,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp),
            color = Color.Black
        )
    }
}