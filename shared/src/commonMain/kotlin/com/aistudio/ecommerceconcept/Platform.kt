package com.aistudio.ecommerceconcept

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform