package com.example.feature_startup.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.example.common.navigation.base.BaseNavigator
import com.example.common.navigation.ext.composableScreen
import com.example.common.navigation.graph.StartupNavGraph
import com.example.common.navigation.graph.StartupNavGraphRoute
import com.example.feature_startup.navigation.route.SplashScreenRoute
import com.example.feature_startup.navigation.screen.SplashScreen
import javax.inject.Inject


//class StartupNavGraphImpl @Inject constructor(): StartupNavGraph(){
//    override fun buildGraph(
//        navigator: BaseNavigator,
//        navGraphBuilder: NavGraphBuilder
//    ){
//        navGraphBuilder.navigation<StartupNavGraphRoute>(
//            startDestination = SplashScreenRoute
//        ){
//            composableScreen<SplashScreenRoute> { SplashScreen(navigator) }
//        }
//    }
//}

//        navGraphBuilder.navigation<StartupNavGraphRoute>(
//            startDestination = SplashScreenRoute::class.toRouteName()){
//            composableScreen<SplashScreenRoute> { SplashScreen(navigator) }
//        }

class StartupNavGraphImpl @Inject constructor(): StartupNavGraph(){
    override fun buildGraph(
        navigator: BaseNavigator,
        navGraphBuilder: NavGraphBuilder
    ){
        navGraphBuilder.navigation<StartupNavGraphRoute>(startDestination = SplashScreenRoute){
            composableScreen<SplashScreenRoute> { SplashScreen(navigator) }
        }
//        navGraphBuilder.navigation<StartupNavGraphRoute>(startDestination = SplashScreenRoute){
//
//        }
//        navGraphBuilder.composableScreen<SplashScreenRoute> {
//            SplashScreen(navigator)
//        }
    }
}