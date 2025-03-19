package com.example.shaya.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.PreviewDynamicColors

private val DarkColorScheme = darkColorScheme(
    primary = Purple200,
    secondary = Purple700,
    background = Black
)

private val LightColorScheme = lightColorScheme(
    primary = Purple500,
    secondary = Teal200,
    background = White
)

@Composable
fun SHAYATheme(
    isDarkTheme: Boolean = false,
    isDynamicColors: Boolean = false,
    content: @Composable()-> Unit
){
    val colorScheme = if (isDarkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = if (isDarkTheme) darkColorScheme() else lightColorScheme(),
        typography = Typography,
        content = content
    )
}
