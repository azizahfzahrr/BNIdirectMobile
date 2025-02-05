package com.example.home.navigation.route

import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.example.common.navigation.base.BaseNavigator
import com.example.common.navigation.ext.composableScreen
import com.example.common.navigation.graph.HomeNavGraph
import com.example.common.navigation.graph.route.HomeNavGraphRoute
import com.example.home.screen.HomeLandingScreen
import javax.inject.Inject

class HomeNavGraphImpl @Inject constructor() : HomeNavGraph() {

    override fun buildGraph(
        navigator: BaseNavigator,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation<HomeNavGraphRoute>(startDestination = HomeLandingRoute){
            composableScreen<HomeLandingRoute> { HomeLandingScreen(navigator) }
        }
    }

    override fun getHomeLandingRoute() = HomeLandingRoute
}