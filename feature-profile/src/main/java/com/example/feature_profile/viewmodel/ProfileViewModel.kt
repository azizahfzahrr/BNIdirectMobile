package com.example.feature_profile.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute
import com.example.feature_profile.navigation.route.ProfileLandingRoute
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
): ViewModel() {
    val args by lazy { savedStateHandle.toRoute<ProfileLandingRoute>() }
}