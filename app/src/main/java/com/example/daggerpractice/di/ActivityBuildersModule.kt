package com.example.daggerpractice.di

import com.example.daggerpractice.MainActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {//This is where we add our activities to. We add a ContributesAndroidInjector for each one

    @ContributesAndroidInjector //Let dagger know that this is a potential client, where AppComponent is the service
    abstract fun contributeMainActivity(): MainActivity
}