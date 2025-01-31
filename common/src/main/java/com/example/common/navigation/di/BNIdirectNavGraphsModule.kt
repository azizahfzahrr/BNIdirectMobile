package com.example.common.navigation.di

import com.example.common.navigation.BNIdirectNavGraphs
import com.example.common.navigation.graph.HomeNavGraph
import com.example.common.navigation.graph.StartupNavGraph
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class BNIdirectNavGraphsModule {

    @Provides
    fun provideBNIdirectNavGraphs(
        startupNavGraph: StartupNavGraph,
        homeNavGraph: HomeNavGraph,
    ) = BNIdirectNavGraphs(
        listOf(
            startupNavGraph,
            homeNavGraph
        )
    )
}

//    @Provides
//    fun provideBNIdirectNavGraphs(
//        startupNavGraph: StartupNavGraph,
//        homeNavGraph: HomeNavGraph
//    ): BNIdirectNavGraphs {
//        return BNIdirectNavGraphs(
//            listOf(
//                startupNavGraph,
//                homeNavGraph
//            )
//        )
//    }
