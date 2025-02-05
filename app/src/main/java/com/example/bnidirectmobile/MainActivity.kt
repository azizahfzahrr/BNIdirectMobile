package com.example.bnidirectmobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.bnidirectmobile.navigation.BNIdirectNavHost
import com.example.bnidirectmobile.ui.theme.BNIdirectMobileTheme
import com.example.common.navigation.BNIdirectNavGraphs
import com.example.common.navigation.base.BaseNavigator
import com.example.feature_startup.navigation.screen.SplashScreen
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var bniDirectNavGraphs: BNIdirectNavGraphs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BNIdirectMobileTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BNIdirectNavHost(bniDirectNavGraphs = bniDirectNavGraphs)
                }
            }
        }
    }
}