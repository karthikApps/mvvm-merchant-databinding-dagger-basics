package com.yottabit.gfmerchant.dagger

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(application: GlamficsApplication?)
}