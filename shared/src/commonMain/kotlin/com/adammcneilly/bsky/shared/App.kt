package com.adammcneilly.bsky.shared

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
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
                isParentPost = true,
                isReplyPost = false,
            )

            val testReply = Post(
                authorImage = UiImage.Local(Res.drawable.bsky),
                authorName = "Adam McNeilly",
                authorHandle = "@adammc.bsky.social",
                timeSincePost = "30m",
                postText = "Ratiod",
                replies = 0,
                reposts = 1000,
                likes = 500000,
                isParentPost = false,
                isReplyPost = true,
            )

            val testRandomPost = Post(
                authorImage = UiImage.Local(Res.drawable.bsky),
                authorName = "Adam McNeilly",
                authorHandle = "@adammc.bsky.social",
                timeSincePost = "2h",
                postText = "Shower Thought",
                replies = 0,
                reposts = 0,
                likes = 0,
                isParentPost = false,
                isReplyPost = false,
            )

            Column(
                modifier = Modifier
                    .padding(scaffoldPadding),
            ) {
                PostListItem(
                    post = testPost,
                )

                PostListItem(
                    post = testReply,
                )

                HorizontalDivider()

                PostListItem(
                    post = testRandomPost,
                )
            }
        }
    }
}
