package com.example.daggerpractice.di

import androidx.lifecycle.ViewModelProvider
import com.example.daggerpractice.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelProviderFactory: ViewModelProviderFactory): ViewModelProvider.Factory

    // This one would have the same results as the Binds method, but the binds is a bit more efficient to provide a dependency
//    companion object {
//        @Provides
//        fun bindFactory(viewModelProviderFactory: ViewModelProviderFactory): ViewModelProvider.Factory{
//            return viewModelProviderFactory
//        }
//    }
}