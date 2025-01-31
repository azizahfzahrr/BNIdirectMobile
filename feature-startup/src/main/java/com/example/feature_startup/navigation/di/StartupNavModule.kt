package com.example.feature_startup.navigation.di

import com.example.common.navigation.graph.StartupNavGraph
import com.example.feature_startup.navigation.StartupNavGraphImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class StartupNavModule {

    @Provides
    fun provideStartupNavGraph() : StartupNavGraph = StartupNavGraphImpl()
}