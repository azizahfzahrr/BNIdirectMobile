package com.example.feature_startup.navigation.screen


import androidx.compose.foundation.background
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

import com.example.common.navigation.base.BaseNavigator
import com.example.common.navigation.graph.HomeNavGraph
import com.example.feature_startup.R
import com.example.feature_startup.navigation.route.SplashScreenRoute
import kotlinx.coroutines.delay
//
//@Composable
//internal fun SplashScreen(
//    navigator: BaseNavigator,
//) {
//    var isSplashScreenFinished by remember { mutableStateOf(false) }
//
//    LaunchedEffect(Unit) {
//        delay(2000)
//        isSplashScreenFinished = true
//    }
//
//    LaunchedEffect(isSplashScreenFinished) {
//        if (isSplashScreenFinished) {
//            navigator.run {
//                navigate(
//                    route = getNavGraph<HomeNavGraph>().getHomeLandingRoute(),
//                    popUpTo = SplashScreenRoute,
//                    inclusive = true
//                )
//            }
//        }
//    }
//}

//@Composable
//fun SplashScreen(
//    navigator: BaseNavigator
//) {
//    LaunchedEffect(true) {
//        delay(2000)
//        navigator.navigateToHomeScreen()
//    }
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White)
//    ) {
//        Text(
//            text = stringResource(R.string.copyright),
//            modifier = Modifier.fillMaxSize()
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun SplashScreenPreview() {
//    val previewNavigator = rememberPreviewNavigator()
//    SplashScreen(navigator = previewNavigator)
//}

@Composable
fun SplashScreen(
    navigator: BaseNavigator) {
    var isSplashScreenFinished by remember { mutableStateOf(false) }

        LaunchedEffect(Unit) {
        delay(2000)
        isSplashScreenFinished = true
    }

    LaunchedEffect(isSplashScreenFinished) {
        if (isSplashScreenFinished) {
            navigator.run {
                navigate(
                    route = getNavGraph<HomeNavGraph>().getHomeLandingRoute(),
                    popUpTo = SplashScreenRoute,
                    inclusive = true
                )
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(
            text = stringResource(R.string.copyright),
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(text = "BNI Direct")
    }
}
