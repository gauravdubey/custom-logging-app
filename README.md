# custom-logging-app
This app is just for creating custom logging App

## Now, let me explain the architecture and how to use this logging system:

1. `LogLevel`: An enum that defines different log levels (VERBOSE, DEBUG, INFO, WARN, ERROR).
2. `Logger`: An interface that defines the logging methods for each log level.
3. `AndroidLogger`: An implementation of the `Logger` interface that uses Android's built-in `Log` class to output log messages.
4. `LoggerConfig`: A configuration class that determines which log levels should be output based on the minimum log level and whether it's a debug build.
5. `LoggerFactory`: A singleton object that manages Logger instances and provides a way to get a Logger for a specific tag.
6. `MainActivity`: A sample usage of the logging system in an Android activity.
7. `MyApplication`: An example of how to initialize the logging system in your Android application.


## To use this logging system in your Android app:

1. Initialize the `LoggerFactory` in your Application class, as shown in the `MyApplication` example.
2. In your activities, fragments, or other classes, get a Logger instance using `LoggerFactory.getLogger(TAG)`.
3. Use the logger methods (v, d, i, w, e) to log messages at different levels.


## This architecture provides several benefits:

- Centralized configuration: You can easily change the logging behavior for the entire app by modifying the `LoggerConfig`.
- Flexibility: You can create different Logger implementations (e.g., for file logging or remote logging) by implementing the `Logger` interface.
- Performance: The `isLoggable` check prevents unnecessary string concatenation and method calls when logging is disabled for a specific level.
- Easy integration: The `LoggerFactory` makes it simple to get a Logger instance in any part of your app.


## You can further extend this system by adding features like:

- File logging for persistent logs
- Remote logging to a server for crash reporting
- Custom formatting of log messages
- Thread-safe logging for multi-threaded environments
