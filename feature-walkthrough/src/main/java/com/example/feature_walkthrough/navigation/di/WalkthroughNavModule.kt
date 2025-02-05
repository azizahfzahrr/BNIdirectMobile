package com.example.feature_walkthrough.navigation.di

import com.example.common.navigation.graph.WalkthroughNavGraph
import com.example.feature_walkthrough.navigation.WalkthroughNavGraphImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class WalkthroughNavModule {

    @Provides
    fun provideWalkthroughNavGraph(): WalkthroughNavGraph = WalkthroughNavGraphImpl()
}