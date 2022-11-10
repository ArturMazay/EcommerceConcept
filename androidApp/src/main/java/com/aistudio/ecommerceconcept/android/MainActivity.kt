package com.aistudio.ecommerceconcept.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import setupThemedNavigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupThemedNavigation()

    }
}

