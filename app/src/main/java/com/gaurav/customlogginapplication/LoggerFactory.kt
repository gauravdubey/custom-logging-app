package com.gaurav.customlogginapplication

object LoggerFactory {
    private val loggers = mutableMapOf<String, Logger>()
    private lateinit var config: LoggerConfig

    fun init(config: LoggerConfig) {
        this.config = config
    }

    fun getLogger(tag: String): Logger {
        return loggers.getOrPut(tag) { AndroidLogger(config) }
    }
}