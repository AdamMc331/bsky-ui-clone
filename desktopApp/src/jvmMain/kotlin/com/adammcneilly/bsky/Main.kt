package com.adammcneilly.bsky

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.adammcneilly.bsky.shared.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinProject",
    ) {
        App()
    }
}
