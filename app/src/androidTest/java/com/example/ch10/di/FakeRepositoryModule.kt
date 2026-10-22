package com.example.ch10.di

import com.example.ch10.data.NewsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton

// Mengganti RepositoryModule saat uji instrumented: aplikasi memakai
// FakeNewsRepository (tanpa internet, tanpa API key).
@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [RepositoryModule::class]
)
abstract class FakeRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindNewsRepository(impl: FakeNewsRepository): NewsRepository
}
