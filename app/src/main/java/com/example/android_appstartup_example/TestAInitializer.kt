package com.example.android_appstartup_example

import android.content.Context
import androidx.startup.Initializer

class TestAInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        // Initializes something needed
        MainActivity.log += "${System.currentTimeMillis()} TestA initialized!\n"
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList() // No dependencies on other libraries.
    }

}