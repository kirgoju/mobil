package com.example.profile.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profile.R
import com.example.profile.ui.theme.ProfileTheme

/**
 * Показывает изображение пользователя в круглой рамке.
 * @param modifier Модификатор аватара.
 */
@Composable
fun Avatar(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.avatar),
        contentDescription = "Аватар пользователя",
        contentScale = ContentScale.Crop,
        modifier = modifier
            .size(120.dp)
            .clip(CircleShape)
    )
}

/** Показывает аватар отдельно от экрана профиля. */
@Preview(showBackground = true)
@Composable
private fun AvatarPreview() {
    ProfileTheme { Avatar() }
}
