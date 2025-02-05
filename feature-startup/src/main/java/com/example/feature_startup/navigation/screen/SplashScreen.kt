package com.example.feature_startup.navigation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.common.navigation.base.BaseNavigator
import com.example.common.navigation.graph.WalkthroughNavGraph
import com.example.feature_startup.R
import com.example.feature_startup.navigation.route.SplashScreenRoute
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navigator: BaseNavigator
) {
    LaunchedEffect(Unit) {
        delay(2000)

        navigator.navigate(
            route = navigator.getNavGraph<WalkthroughNavGraph>().getWalkthroughLandingRoute(),
            popUpTo = SplashScreenRoute,
            inclusive = true
        )
//
//        navigator.navigate(
//            route = "walkthrough",
//            popUpTo = "splashScreenRoute",
//            inclusive = true
//        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        Image(
            painter = painterResource(id = com.example.common.R.drawable.ic_bnidirect),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.Center)
                .size(200.dp)
        )
        Text(
            text = stringResource(R.string.copyright),
            color = Color(0xFF414651),
            fontSize = 10.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 48.dp)
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
        Text(
            text = "BNI Direct",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}