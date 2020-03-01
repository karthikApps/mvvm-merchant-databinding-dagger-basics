package com.yottabit.gfmerchant.dagger

import android.content.Context
import dagger.Provides
import javax.inject.Singleton

class AppModule {
    private var application: GlamficsApplication? = null

    fun AppModule(application: GlamficsApplication?) {
        this.application = application
    }

    @Provides
    @Singleton
    fun provideGfApplication(): Context? {
        return application!!.applicationContext
    }
}