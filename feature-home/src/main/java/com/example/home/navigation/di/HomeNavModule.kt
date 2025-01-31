package com.example.home.navigation.di

import com.example.common.navigation.graph.HomeNavGraph
import com.example.home.navigation.route.HomeNavGraphImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class HomeNavModule {

    @Provides
    fun provideHomeNavGraoh(): HomeNavGraph = HomeNavGraphImpl()
}