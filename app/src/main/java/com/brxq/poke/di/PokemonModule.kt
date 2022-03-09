package com.brxq.poke.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MyModule{

    @Provides
    @Singleton
    fun provideString() = "Provided String"

}
