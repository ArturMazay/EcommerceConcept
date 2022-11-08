pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "EcommerceConcept"
include(":androidApp")
include(":shared")

include(":common:auth:api")
include(":common:auth:data")
include(":common:auth:presentation")

include(":common:basket:api")
include(":common:basket:data")
include(":common:basket:presentation")

include(":common:showcase:api")
include(":common:showcase:data")
include(":common:showcase:presentation")

include(":common:core")

include("common:umbrella-ios") //это для обобщеный блок зависимостей иосовских
include("common:umbrella-compose") //это для обобщеный блок зависимостей андроидовских