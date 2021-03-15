package com.example.android.hilt.di

import com.example.android.hilt.data.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 * Created by Simform Solutions on 15 March 2021.
 **/
@InstallIn(ApplicationComponent::class)
@Module
object DatabaseModule {

    @Provides
    fun provideLogDao(appDatabase: AppDatabase) {
        appDatabase.logDao()
    }
}