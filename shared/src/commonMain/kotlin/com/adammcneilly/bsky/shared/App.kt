package com.adammcneilly.bsky.shared

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adammcneilly.bsky.shared.ui.UiImage
import com.adammcneilly.bsky.shared.ui.components.PostListItem
import com.adammcneilly.bsky.shared.ui.components.SkyBottomBar
import com.adammcneilly.bsky.shared.ui.components.SkyTopBar
import com.adammcneilly.bsky.shared.ui.theme.SkyTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App() {
    SkyTheme {
        Scaffold(
            topBar = {
                SkyTopBar()
            },
            bottomBar = {
                SkyBottomBar(
                    onTabClicked = { tab ->
                        // TODO: Handle tab click
                    },
                )
            },
        ) { scaffoldPadding ->
            val testPost = Post(
                authorImage = UiImage.Local(Res.drawable.bsky),
                authorName = "Hank Green",
                authorHandle = "@hankgreen.bsky.social",
                timeSincePost = "1h",
                postText = "Everyone was complaining about Connections today but I thought it was super fun...",
                replies = 57,
                reposts = 8,
                likes = 345,
            )

            PostListItem(
                post = testPost,
                modifier = Modifier
                    .padding(scaffoldPadding),
            )
        }
    }
}
