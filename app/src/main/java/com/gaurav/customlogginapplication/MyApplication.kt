package com.gaurav.customlogginapplication
import android.app.Application

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        val isDebugBuild = BuildConfig.DEBUG
        val config = LoggerConfig(minLogLevel = LogLevel.DEBUG, isDebugBuild = isDebugBuild)
        LoggerFactory.init(config)
    }
}