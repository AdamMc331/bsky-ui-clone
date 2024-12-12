package com.adammcneilly.bsky.shared

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
            Text(
                text = "App Stub",
                modifier = Modifier
                    .padding(scaffoldPadding),
            )
        }
    }
}
