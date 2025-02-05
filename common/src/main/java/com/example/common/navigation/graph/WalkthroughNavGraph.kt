package com.example.common.navigation.graph

import com.example.common.navigation.base.BaseNavGraph

abstract class WalkthroughNavGraph : BaseNavGraph(){
    abstract fun getWalkthroughLandingRoute(): Any
}