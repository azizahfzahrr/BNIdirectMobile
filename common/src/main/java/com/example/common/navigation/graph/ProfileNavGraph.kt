package com.example.common.navigation.graph

import com.example.common.navigation.base.BaseNavGraph

abstract class ProfileNavGraph: BaseNavGraph(){
    abstract fun getProfileLandingRoute(nama: String) : Any
}