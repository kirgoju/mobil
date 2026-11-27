package com.example.profile.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profile.ui.theme.ProfileTheme

/**
 * Показывает кнопки подписки и сброса имени.
 * @param isSubscribed Текущее состояние подписки, от которого зависит текст кнопки.
 * @param onSubscribeClick Действие при нажатии на кнопку подписки.
 * @param onResetClick Действие при нажатии на кнопку сброса имени.
 * @param modifier Модификатор строки кнопок.
 */
@Composable
fun ActionButtons(
    isSubscribed: Boolean,
    onSubscribeClick: () -> Unit,
    onResetClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Button(onClick = onSubscribeClick, modifier = Modifier.weight(1f)) {
            Text(if (isSubscribed) "Отписаться" else "Подписаться")
        }
        OutlinedButton(onClick = onResetClick, modifier = Modifier.weight(1f)) {
            Text("Сбросить")
        }
    }
}

/** Показывает кнопки до оформления подписки. */
@Preview(showBackground = true, widthDp = 360)
@Composable
private fun ActionButtonsPreview() {
    ProfileTheme {
        ActionButtons(isSubscribed = false, onSubscribeClick = {}, onResetClick = {})
    }
}
