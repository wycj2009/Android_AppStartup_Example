package com.example.android_appstartup_example

import android.content.Context
import androidx.startup.Initializer

class TestBInitializer : Initializer<Int> {

    override fun create(context: Context): Int {
        // Initializes something needed
        MainActivity.log += "${System.currentTimeMillis()} TestB initialized!\n"
        return 1
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        // Defines a dependency on TestAInitializer so it can be initialized after TestA is initialized.
        return listOf(TestAInitializer::class.java)
    }

}