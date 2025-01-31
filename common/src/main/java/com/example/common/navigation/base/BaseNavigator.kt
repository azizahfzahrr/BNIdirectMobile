package com.example.common.navigation.base

import androidx.navigation.NavHostController
import com.example.common.navigation.graph.HomeNavGraph

open class BaseNavigator(
    val navController: NavHostController,
    val navGraphs: List<BaseNavGraph>
) {
    fun navigate(
        route: Any,
        popUpTo: Any? = null,
        inclusive: Boolean = false
    ) {
        navController.navigate(route) {
            popUpTo?.let {
                this.popUpTo(it) {
                    this.inclusive = inclusive }
            }
        }
    }

    fun popBackStack() = navController.popBackStack()

    inline fun <reified navGraph: BaseNavGraph> getNavGraph() = navGraphs.find { it is navGraph} as navGraph

//    inline fun <reified NavGraph: BaseNavGraph> getNavGraph(): NavGraph {
//        return navGraphs.find { it is NavGraph } as NavGraph
//    }

//    open fun navigateToHomeScreen(){
//        val homeRoute = getNavGraph<HomeNavGraph>().getHomeLandingRoute().toString()
//        navigate(
//            route = homeRoute,
//            popUpTo = SplashScreenRoute,
//            inclusive = true
//        )
//    }
}