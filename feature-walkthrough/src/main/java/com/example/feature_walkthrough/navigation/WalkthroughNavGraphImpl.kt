package com.example.feature_walkthrough.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.common.navigation.base.BaseNavigator
import com.example.common.navigation.graph.WalkthroughNavGraph
import com.example.common.navigation.graph.route.WalkthroughNavGraphRoute
import com.example.feature_walkthrough.navigation.route.WalkthroughRoute
import com.example.feature_walkthrough.navigation.screen.WalkthroughScreen
import javax.inject.Inject

class WalkthroughNavGraphImpl @Inject constructor(): WalkthroughNavGraph() {

    override fun buildGraph(
        navigator: BaseNavigator,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation<WalkthroughNavGraphRoute>(startDestination = WalkthroughRoute){
            composable<WalkthroughRoute> { WalkthroughScreen(navigator) }
        }
    }

    override fun getWalkthroughLandingRoute() = WalkthroughRoute
}
