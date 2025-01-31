package com.example.common.navigation

import com.example.common.navigation.base.BaseNavGraph
import javax.inject.Inject

class BNIdirectNavGraphs @Inject constructor(
    private val navGraphs: List<BaseNavGraph>
){
    fun getNavGraphs() = navGraphs
//    fun getNavGraphs(): List<BaseNavGraph>{
//        return navGraphs
//    }
}