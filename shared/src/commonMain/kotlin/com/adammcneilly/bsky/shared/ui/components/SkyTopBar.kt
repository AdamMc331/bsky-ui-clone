package com.adammcneilly.bsky.shared.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Feed
import androidx.compose.material.icons.filled.Feed
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.adammcneilly.bsky.shared.Res
import com.adammcneilly.bsky.shared.bsky
import com.adammcneilly.bsky.shared.ui.UiImage

@Composable
fun SkyTopBar(
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .statusBarsPadding(),
    ) {
        IconButton(
            onClick = {
                // TODO:
            },
        ) {
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "Open Menu",
            )
        }

        ImageWrapper(
            image = UiImage.Local(Res.drawable.bsky),
            contentDescription = "Bluesky Logo",
            modifier = Modifier
                .size(24.dp),
        )

        IconButton(
            onClick = {
            },
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.Feed,
                contentDescription = "Feeds",
            )
        }
    }
}
