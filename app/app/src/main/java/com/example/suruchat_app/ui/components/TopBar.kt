package com.example.suruchat_app.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.suruchat_app.ui.screens.home.HomeViewModel

@Composable
fun TopBar(
    title: String,
    onTopButtonClicked: () -> Unit,
    topButtonImageVector: ImageVector
) {
    TopAppBar(
        title = {
            Text(text = title, color = Color.White)
        },
        navigationIcon = {
            Icon(
                imageVector = topButtonImageVector,
                contentDescription = "",
                //when click on menu, triggering function should call
                modifier = Modifier
                    .padding(start = 4.dp)
                    .clickable(onClick = onTopButtonClicked),
                tint = Color.White
            )
        },
        backgroundColor = MaterialTheme.colors.primary
    )
}