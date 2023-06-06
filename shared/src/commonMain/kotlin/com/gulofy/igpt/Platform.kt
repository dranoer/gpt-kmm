package com.gulofy.igpt

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform