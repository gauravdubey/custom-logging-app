package com.gaurav.customlogginapplication

import android.util.Log

class AndroidLogger(private val config: LoggerConfig) : Logger {
    override fun v(tag: String, message: String) {
        if (config.isLoggable(LogLevel.VERBOSE)) {
            Log.v(tag, message)
        }
    }

    override fun d(tag: String, message: String) {
        if (config.isLoggable(LogLevel.DEBUG)) {
            Log.d(tag, message)
        }
    }

    override fun i(tag: String, message: String) {
        if (config.isLoggable(LogLevel.INFO)) {
            Log.i(tag, message)
        }
    }

    override fun w(tag: String, message: String) {
        if (config.isLoggable(LogLevel.WARN)) {
            Log.w(tag, message)
        }
    }

    override fun e(tag: String, message: String) {
        if (config.isLoggable(LogLevel.ERROR)) {
            Log.e(tag, message)
        }
    }

    override fun e(tag: String, message: String, throwable: Throwable) {
        if (config.isLoggable(LogLevel.ERROR)) {
            Log.e(tag, message, throwable)
        }
    }
}