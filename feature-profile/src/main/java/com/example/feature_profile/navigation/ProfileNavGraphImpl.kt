package com.example.feature_profile.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.common.navigation.base.BaseNavigator
import com.example.common.navigation.graph.ProfileNavGraph
import com.example.common.navigation.graph.route.ProfileNavGraphRoute
import com.example.feature_profile.navigation.route.ProfileLandingRoute
import com.example.feature_profile.screen.ProfileLandingScreen
import javax.inject.Inject

class ProfileNavGraphImpl @Inject constructor() : ProfileNavGraph() {

    override fun buildGraph(
        navigator: BaseNavigator,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation<ProfileNavGraphRoute>(startDestination = ProfileLandingRoute::class) {
            composable<ProfileLandingRoute> { ProfileLandingScreen(navigator) }
        }
    }

    override fun getProfileLandingRoute(nama: String) = ProfileLandingRoute(nama)

}