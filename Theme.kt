package com.example.mojaklasa.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val JasneKolory = lightColorScheme(
    primary = Niebieski40,
    primaryContainer = NiebieskiKontener,
    onPrimaryContainer = NaNiebieskimKontenerze,
    secondary = Stalowy40,
    tertiary = Miedziany40
)

private val CiemneKolory = darkColorScheme(
    primary = Niebieski80,
    primaryContainer = NiebieskiKontenerCiemny,
    onPrimaryContainer = NaNiebieskimKontenerzeCiemnym,
    secondary = Stalowy80,
    tertiary = Miedziany80
)

@Composable
fun MojaKlasaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) CiemneKolory else JasneKolory,
        typography = Typography,
        content = content
    )
}
