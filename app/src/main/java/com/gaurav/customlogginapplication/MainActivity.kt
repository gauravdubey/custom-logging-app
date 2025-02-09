package com.gaurav.customlogginapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val logger = LoggerFactory.getLogger(MainActivity::class.java.simpleName)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logger.d("onCreate", "Activity created")

        try {
            // Some code that might throw an exception
            throw IllegalArgumentException("Sample exception")
        } catch (e: Exception) {
            logger.e("onCreate", "An error occurred", e)
        }
    }

    override fun onResume() {
        super.onResume()
        logger.i("onResume", "Activity resumed")
    }
}