package com.example.lb1
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lb1.ui.theme.Lb1Theme

/**
 * Главная Activity первого приложения на Jetpack Compose.
 *
 * @author Ковальчук Н. А.
 * @version 1.0
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lb1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Ковальчук Н. А.",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF0F4FF))
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "первое приложение",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF172554)
        )
        Text(
            text = name,
            fontSize = 22.sp,
            color = Color(0xFF2563EB)
        )
        Text(
            text = "Группа: ПИН-б-о-24-2",
            fontSize = 18.sp,
            color = Color(0xFF475569)
        )
    }
}
/** Предпросмотр главного экрана приложения. */

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lb1Theme {
        Greeting("Ковальчук Н. А.")
    }
}