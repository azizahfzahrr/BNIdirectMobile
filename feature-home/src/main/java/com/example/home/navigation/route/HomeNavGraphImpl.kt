package com.example.home.navigation.route

import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.example.common.navigation.base.BaseNavigator
import com.example.common.navigation.ext.composableScreen
import com.example.common.navigation.graph.HomeNavGraph
import com.example.common.navigation.graph.HomeNavGraphRoute
import com.example.home.screen.HomeLandingScreen
import javax.inject.Inject

class HomeNavGraphImpl @Inject constructor() : HomeNavGraph() {
    override fun buildGraph(
        navigator: BaseNavigator,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation<HomeNavGraphRoute>(startDestination = HomeLandingRoute) {
            composableScreen<HomeLandingRoute> { HomeLandingScreen(navigator) }
        }
    }

    override fun getHomeLandingRoute() = HomeLandingRoute
}
//        navGraphBuilder.navigation<HomeNavGraphRoute>(
//            startDestination = HomeLandingRoute::class.toRouteName()){
//            composableScreen<HomeLandingRoute> { HomeLandingScreen(navigator) }
//        }
//        super.buildGraph(navigator, navGraphBuilder)

//    override fun getHomeLandingRoute() : String{
//        return HomeLandingRoute::class.toRouteName()
//    }
