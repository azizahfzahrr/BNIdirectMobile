package com.example.bnidirectmobile.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.common.navigation.BNIdirectNavGraphs
import com.example.common.navigation.base.BaseNavigator
import com.example.common.navigation.graph.route.StartupNavGraphRoute
import kotlin.reflect.KClass

@Composable
fun BNIdirectNavHost(
    bniDirectNavGraphs: BNIdirectNavGraphs,
    modifier: Modifier = Modifier,
    startDestination: KClass<*> = StartupNavGraphRoute::class
//    startDestination: String = "startup" // Route untuk StartupNavGraph
) {
    val navController = rememberNavController()
    val navGraphs = remember { bniDirectNavGraphs.getNavGraphs() }
    val navigator = remember { BaseNavigator(navController, navGraphs) }

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        navGraphs.forEach { navGraph ->
            navGraph.buildGraph(navigator, this)
        }
    }
}