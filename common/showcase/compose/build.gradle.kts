plugins {    id("multiplatform-compose-setup")    id("android-setup")    id("com.adeo.libres")}libres{    generatedClassName = "MainRes"    generateNamedArguments = true    baseLocaleLanguageCode = "ru"}kotlin {    sourceSets {        commonMain {            dependencies {                implementation(project(":common:showcase:presentation"))                implementation(project(":common:core-compose"))                implementation(project(":common:core-utils"))                implementation(project(":common:core"))                implementation(Dependencies.Other.MultiplatformResources.ResourceLibres)                implementation(Dependencies.Other.ViewModel.core)                implementation(Dependencies.Other.ViewModel.compose)                implementation(Dependencies.Other.ViewModel.odyssey)                implementation(Dependencies.Other.Navigation.core)                implementation(Dependencies.Other.Navigation.compose)            }        }        androidMain {            dependencies {                implementation(Dependencies.Image.Coil.compose)                implementation(Dependencies.Android.Compose.constrainLayout)            }        }    }}