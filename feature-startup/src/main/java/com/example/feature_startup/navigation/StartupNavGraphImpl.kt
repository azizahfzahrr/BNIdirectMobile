package com.example.feature_startup.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.common.navigation.base.BaseNavigator
import com.example.common.navigation.graph.StartupNavGraph
import com.example.common.navigation.graph.route.StartupNavGraphRoute
import com.example.feature_startup.navigation.route.SplashScreenRoute
import com.example.feature_startup.navigation.screen.SplashScreen
import com.example.feature_walkthrough.navigation.route.WalkthroughRoute
import com.example.feature_walkthrough.navigation.screen.WalkthroughScreen
import javax.inject.Inject

class StartupNavGraphImpl @Inject constructor() : StartupNavGraph() {

    override fun buildGraph(
        navigator: BaseNavigator,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation<StartupNavGraphRoute>(startDestination = SplashScreenRoute) {
            composable<SplashScreenRoute> { SplashScreen(navigator) }
            composable<WalkthroughRoute> { WalkthroughScreen(navigator) }
        }
    }
}