package com.gulofy.igpt.android

import android.app.Application
import com.gulofy.igpt.core.GPT
import com.gulofy.igpt.core.create
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module

class App : Application() {

    private val appModule = module {
        single { GPT.create(get(), BuildConfig.DEBUG) }
    }

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            if (BuildConfig.DEBUG) androidLogger(Level.ERROR)

            androidContext(this@App)
            modules(appModule)
        }
    }
}