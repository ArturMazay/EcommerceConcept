package com.aistudio.ecommerceconcept.android

import ShowcaseRepository
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import di.Inject.instance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import setupThemedNavigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

          setupThemedNavigation()

    }
}

