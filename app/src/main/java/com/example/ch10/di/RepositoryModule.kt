package com.example.ch10.di

import com.example.ch10.data.NewsRepository
import com.example.ch10.data.NewsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// Interface diikat dengan @Binds (bukan @Provides) agar implementasinya tetap
// bisa di-inject langsung (mis. @Inject constructor).
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindNewsRepository(impl: NewsRepositoryImpl): NewsRepository
}
