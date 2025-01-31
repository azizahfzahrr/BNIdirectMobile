package com.example.common.navigation.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

//@Composable
//fun rememberPreviewNavigator(): PreviewNavigator{
//    val navController = rememberNavController()
//    return remember { PreviewNavigator(navController) }
//}
//
//
//
//class PreviewNavigator(navController: NavHostController): BaseNavigator(
//    navController = navController,
//    navGraphs = emptyList()
//) {
//    override fun navigateToHomeScreen(){
//        println("Navigate to HomeScreen (preview)")
//    }
//}