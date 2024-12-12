package com.adammcneilly.bsky.shared

import com.adammcneilly.bsky.shared.ui.UiImage

data class Post(
    val authorImage: UiImage,
    val authorName: String,
    val authorHandle: String,
    val timeSincePost: String,
    val postText: String,
    val replies: Int,
    val reposts: Int,
    val likes: Int,
)
