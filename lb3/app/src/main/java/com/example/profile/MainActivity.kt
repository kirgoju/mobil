package com.example.profile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.profile.ui.ProfileScreen
import com.example.profile.ui.theme.ProfileTheme

/** Точка входа приложения. Открывает экран профиля на Jetpack Compose. */
class MainActivity : ComponentActivity() {
    /**
     * Подключает тему и экран профиля к Activity.
     * @param savedInstanceState Состояние Activity, сохранённое системой.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ProfileScreen(modifier = Modifier.safeDrawingPadding())
                }
            }
        }
    }
}
