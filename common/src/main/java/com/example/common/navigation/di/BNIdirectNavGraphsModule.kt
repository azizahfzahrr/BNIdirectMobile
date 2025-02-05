package com.example.common.navigation.di

import com.example.common.navigation.BNIdirectNavGraphs
import com.example.common.navigation.graph.HomeNavGraph
import com.example.common.navigation.graph.ProfileNavGraph
import com.example.common.navigation.graph.StartupNavGraph
import com.example.common.navigation.graph.WalkthroughNavGraph
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
        walkthroughNavGraph: WalkthroughNavGraph,
        profileNavGraph: ProfileNavGraph
    ) = BNIdirectNavGraphs(
        listOf(
            startupNavGraph,
            homeNavGraph,
            walkthroughNavGraph,
            profileNavGraph
        )
    )
}
