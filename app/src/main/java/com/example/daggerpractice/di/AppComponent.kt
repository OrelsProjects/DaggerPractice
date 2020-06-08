package com.example.daggerpractice.di

import android.app.Application
import com.example.daggerpractice.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton//This annotation means that everything that has that annotation will be alive as long as the AppComponent lives, and will have 1  instance
@Component(
    modules = [
        AndroidSupportInjectionModule::class,/*Only need to be declared once, in the AppComponent*/
        ActivityBuildersModule::class,
        AppModule::class,
        ViewModelFactoryModule::class
    ]

)
interface AppComponent : AndroidInjector<BaseApplication> {

    //    fun inject(mainActivity: MainActivity) This process has been simplified!
    @Component.Builder
    interface Builder {
        @BindsInstance//Used if we have args that we want to bind to our component
        fun application(app: Application): Builder//Bind an application instance to the application component
        fun build(): AppComponent
    }
}

//All we did here is basic initiation of a dagger project