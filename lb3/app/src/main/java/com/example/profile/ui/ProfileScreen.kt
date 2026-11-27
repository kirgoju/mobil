package com.example.profile.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profile.data.User
import com.example.profile.ui.components.ActionButtons
import com.example.profile.ui.components.Avatar
import com.example.profile.ui.components.ProfileInfo
import com.example.profile.ui.theme.ProfileTheme

/**
 * Собирает экран и хранит состояние редактирования имени, фамилии, подписки и счётчика.
 * @param user Исходные данные профиля.
 * @param modifier Модификатор корневой колонки экрана.
 */
@Composable
fun ProfileScreen(user: User = User(), modifier: Modifier = Modifier) {
    var name by remember(user.name) { mutableStateOf(user.name) }
    var surname by remember(user.surname) { mutableStateOf(user.surname) }
    var isSubscribed by remember(user.isSubscribed) { mutableStateOf(user.isSubscribed) }
    var clicks by remember { mutableStateOf(0) }
    val followers = when {
        isSubscribed == user.isSubscribed -> user.followers
        isSubscribed -> user.followers + 1
        else -> user.followers - 1
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Avatar()
        ProfileInfo(user = user.copy(name = name, surname = surname, followers = followers))
        HorizontalDivider()

        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Имя") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            value = surname,
            onValueChange = { surname = it },
            label = { Text("Фамилия") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        ActionButtons(
            isSubscribed = isSubscribed,
            onSubscribeClick = { isSubscribed = !isSubscribed },
            onResetClick = {
                name = user.name
                surname = user.surname
            }
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Количество нажатий: $clicks")
            Button(onClick = { clicks++ }) {
                Text("+")
            }
        }
    }
}

/** Показывает весь экран профиля в Android Studio. */
@Preview(showBackground = true, widthDp = 390, heightDp = 680)
@Composable
private fun ProfileScreenPreview() {
    ProfileTheme { Surface { ProfileScreen() } }
}
