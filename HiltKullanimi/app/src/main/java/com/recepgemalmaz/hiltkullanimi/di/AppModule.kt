package com.recepgemalmaz.hiltkullanimi.di

import com.recepgemalmaz.hiltkullanimi.Adres
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideAdres(): Adres {
        return Adres("İstanbul/Kadıköy")
    }
}