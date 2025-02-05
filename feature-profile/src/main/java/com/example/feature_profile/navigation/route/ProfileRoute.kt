package com.example.feature_profile.navigation.route

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class ProfileLandingRoute(
    val nama: String
): Parcelable