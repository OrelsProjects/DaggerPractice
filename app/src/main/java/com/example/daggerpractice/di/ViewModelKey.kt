package com.example.daggerpractice.di

import android.sax.Element
import androidx.lifecycle.ViewModel
import dagger.MapKey
import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import kotlin.reflect.KClass

@MustBeDocumented
@Target(*[AnnotationTarget.FUNCTION])
@Retention(AnnotationRetention.RUNTIME)//The same AnnotationRetention you would use in a Singleton annotation
@MapKey//Something that can be used to map similar dependencies and use them together
//We are injecting a Map where the keys are classes of ViewModel and the keys are Providers of ViewModel in the ViewModelProviderFactory
//This map dependency is coming from this annotation (ViewModelKey)

annotation class ViewModelKey(val value: KClass<out ViewModel>) { // This val is the equivalent of an interface  method inside a java annotation class. (which is public @interface x)
}