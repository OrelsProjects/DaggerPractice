package com.example.daggerpractice.di

import com.example.daggerpractice.di.main.MainViewModelModule
import com.example.daggerpractice.ui.mainactivity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class  ActivityBuildersModule {//This is where we add our activities to. We add a ContributesAndroidInjector for each one

    @ContributesAndroidInjector(
        modules = [MainViewModelModule::class] // We want this module to be included only to the MainActivity SubComponent
    ) //Let dagger know that this is a potential client, where AppComponent is the service
    abstract fun contributeMainActivity(): MainActivity
}