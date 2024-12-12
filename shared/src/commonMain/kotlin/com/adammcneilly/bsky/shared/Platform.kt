package com.adammcneilly.bsky.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
