package com.example.common.navigation.ext

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlin.reflect.KClass

inline fun <reified T : Any> NavGraphBuilder.composableScreen(
    noinline content: @Composable (NavBackStackEntry) -> Unit
) {
    composable<T> { backStackEntry ->
        content(backStackEntry)
    }
}

//fun KClass<*>.toRouteName(): String {
//    return this.qualifiedName ?: error("route must have a qualified name")
//}

//fun KClass<*>.toRouteName(): String {
//    // Check if the class is of type BaseRoute and can be cast
//    val route = (this.objectInstance as? BaseRoute)?.routeName
//    return route ?: error("route must have a qualified name or BaseRoute should be implemented")
//}

// inline fun <reified T : Any> NavGraphBuilder.composableScreen(
////    noinline content: @Composable (NavBackStackEntry) -> Unit
////) {
////    composable(route = T::class.toRouteName()) { backStackEntry ->
////        content(backStackEntry)
////    }
////}


