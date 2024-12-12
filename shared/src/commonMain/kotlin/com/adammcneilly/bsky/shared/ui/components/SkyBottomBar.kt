package com.adammcneilly.bsky.shared.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.adammcneilly.bsky.shared.HomeTab

@Composable
fun SkyBottomBar(
    onTabClicked: (HomeTab) -> Unit,
    tabs: List<HomeTab> = HomeTab.entries,
    selectedTab: HomeTab = tabs.first(),
    modifier: Modifier = Modifier,
) {
    NavigationBar(
        modifier = modifier,
    ) {
        tabs.forEach { tab ->
            val isSelected = (selectedTab == tab)

            NavigationBarItem(
                selected = isSelected,
                onClick = {
                    onTabClicked.invoke(tab)
                },
                icon = {
                    val imageVector = if (isSelected) {
                        tab.selectedIcon
                    } else {
                        tab.unselectedIcon
                    }

                    Icon(
                        imageVector = imageVector,
                        contentDescription = tab.label,
                    )
                },
            )
        }
    }
}
