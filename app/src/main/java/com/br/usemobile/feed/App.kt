package com.br.usemobile.feed

import android.app.Application
import com.br.usemobile.feed.di.presentationModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(presentationModules)
        }
    }
}