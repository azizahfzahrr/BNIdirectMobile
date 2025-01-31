package com.example.common.navigation.graph

import com.example.common.navigation.base.BaseNavGraph
import kotlinx.serialization.Serializable

@Serializable
object HomeNavGraphRoute

abstract class HomeNavGraph: BaseNavGraph(){
    abstract fun getHomeLandingRoute() : Any
}