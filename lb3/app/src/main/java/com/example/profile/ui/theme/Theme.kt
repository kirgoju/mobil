package com.example.profile.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF2457A7),
    primaryContainer = Color(0xFFD9E5FF),
    onPrimaryContainer = Color(0xFF102D60)
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFFACC7FF),
    primaryContainer = Color(0xFF23447A),
    onPrimaryContainer = Color(0xFFE1EAFF)
)

/**
 * Задаёт цвета Material 3 для компонентов профиля.
 * @param content Содержимое, к которому применяется тема.
 */
@Composable
fun ProfileTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) DarkColors else LightColors,
        content = content
    )
}
