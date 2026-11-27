package com.example.profile.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profile.data.User
import com.example.profile.ui.theme.ProfileTheme

/**
 * Показывает имя, статус и количество подписчиков.
 * @param user Данные, которые нужно отобразить.
 * @param modifier Модификатор колонки с информацией.
 */
@Composable
fun ProfileInfo(user: User, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Text(
            text = "${user.name} ${user.surname}".trim(),
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = user.status,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Подписчиков: ${user.followers}",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

/** Показывает пример данных пользователя. */
@Preview(showBackground = true)
@Composable
private fun ProfileInfoPreview() {
    ProfileTheme { Surface { ProfileInfo(user = User()) } }
}
