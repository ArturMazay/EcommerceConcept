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

include(":common:auth:api")
include(":common:auth:data")
include(":common:auth:presentation")
include(":common:auth:compose")

include(":common:basket:api")
include(":common:basket:data")
include(":common:basket:presentation")
include(":common:basket:compose")

include(":common:showcase:api")
include(":common:showcase:data")
include(":common:showcase:presentation")
include(":common:showcase:compose")

include(":common:core")
include(":common:core-utils")

include(":common:core-compose") //будет лежать тема и всяике штуки для всех платформ

include(":common:umbrella-core")//надо чтоб выстроить di дерево для всех платформ
include("common:umbrella-ios") //это для обобщеный блок зависимостей иосовских
include("common:umbrella-compose") //это для обобщеный блок зависимостей андроидовских