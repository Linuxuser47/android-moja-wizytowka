package com.example.mojawizytowka.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

// Wizytówka ma zawsze ten sam, ciemny wygląd – niezależnie od ustawień telefonu
private val KoloryWizytowki = darkColorScheme(
    primary = Bursztyn,
    onPrimary = Granat,
    background = Granat,
    onBackground = JasnyTekst,
    surface = Granat,
    onSurface = JasnyTekst
)

@Composable
fun MojaWizytowkaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = KoloryWizytowki,
        typography = Typography,
        content = content
    )
}
