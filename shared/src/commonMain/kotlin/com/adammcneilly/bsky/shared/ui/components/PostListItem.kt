package com.adammcneilly.bsky.shared.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Reply
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.adammcneilly.bsky.shared.Post

@Composable
fun PostListItem(
    post: Post,
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
            .padding(16.dp),
    ) {
        ImageWrapper(
            image = post.authorImage,
            contentDescription = "${post.authorName} Profile Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape),
        )

        PostInfo(post)
    }
}

@Composable
private fun PostInfo(
    post: Post,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
            .fillMaxWidth(),
    ) {
        AuthorInfo(
            post = post,
            modifier = Modifier
                .fillMaxWidth(),
        )

        Text(
            text = post.postText,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .fillMaxWidth(),
        )

        StatBar(
            post = post,
            modifier = Modifier
                .fillMaxWidth(),
        )
    }
}

@Composable
private fun AuthorInfo(
    post: Post,
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier,
    ) {
        Text(
            text = post.authorName,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )

        Text(
            text = post.authorHandle,
            maxLines = 1,
            style = MaterialTheme.typography.bodyMedium
                .copy(
                    color = LocalContentColor.current.copy(
                        alpha = 0.75F,
                    ),
                ),
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .weight(1F),
        )

        Text(
            text = "· ${post.timeSincePost}",
            maxLines = 1,
            style = MaterialTheme.typography.bodyMedium
                .copy(
                    color = LocalContentColor.current.copy(
                        alpha = 0.75F,
                    ),
                ),
        )
    }
}

@Composable
private fun StatBar(
    post: Post,
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxWidth(),
    ) {
        PostStat(
            icon = Icons.AutoMirrored.Outlined.Reply,
            contentDescription = "Replies",
            value = post.replies.toString(),
        )

        PostStat(
            icon = Icons.Outlined.Shuffle,
            contentDescription = "Reposts",
            value = post.reposts.toString(),
        )

        PostStat(
            icon = Icons.Outlined.FavoriteBorder,
            contentDescription = "Likes",
            value = post.likes.toString(),
        )

        Icon(
            imageVector = Icons.Outlined.MoreHoriz,
            contentDescription = "Post Options",
        )
    }
}

@Composable
private fun PostStat(
    icon: ImageVector,
    contentDescription: String,
    value: String,
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
        )

        Text(
            text = value,
        )
    }
}
