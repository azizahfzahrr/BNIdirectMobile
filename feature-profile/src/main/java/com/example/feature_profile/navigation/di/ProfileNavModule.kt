package com.example.feature_profile.navigation.di

import com.example.common.navigation.graph.ProfileNavGraph
import com.example.feature_profile.navigation.ProfileNavGraphImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ProfileNavModule {

    @Provides
    fun provideProfileNavGraph(): ProfileNavGraph = ProfileNavGraphImpl()
}