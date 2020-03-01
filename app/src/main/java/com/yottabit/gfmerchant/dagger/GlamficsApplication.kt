package com.yottabit.gfmerchant.dagger

import androidx.multidex.MultiDexApplication

class GlamficsApplication : MultiDexApplication() {
    private var instance: GlamficsApplication? = null
    private var appComponent: AppComponent? = null

    fun getGlamficsApplication(): GlamficsApplication? {
        return GlamficsApplication().instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}