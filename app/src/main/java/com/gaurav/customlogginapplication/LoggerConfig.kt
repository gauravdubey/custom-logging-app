package com.gaurav.customlogginapplication

class LoggerConfig(
    private val minLogLevel: LogLevel = LogLevel.VERBOSE,
    private val isDebugBuild: Boolean = true
) {
    fun isLoggable(level: LogLevel): Boolean {
        return isDebugBuild && level.ordinal >= minLogLevel.ordinal
    }
}
