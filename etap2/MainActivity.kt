package com.example.mojaklasa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mojaklasa.ui.theme.MojaKlasaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MojaKlasaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Wywołanie własnej funkcji z parametrami tekstowymi
                    MojaKlasa(
                        szkola = stringResource(R.string.nazwa_szkoly),
                        klasa = stringResource(R.string.klasa),
                        kierunek = stringResource(R.string.kierunek),
                        opisKierunku = stringResource(R.string.opis_kierunku),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

/**
 * Własna funkcja interfejsu użytkownika.
 * Wyświetla nazwę szkoły, klasę, kierunek i krótki opis kierunku
 * w kolumnie (Column), z odstępami (padding) i różnymi rozmiarami tekstu.
 */
@Composable
fun MojaKlasa(
    szkola: String,
    klasa: String,
    kierunek: String,
    opisKierunku: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        // 1. Nazwa szkoły – największy tekst
        Text(
            text = szkola,
            fontSize = 34.sp,
            lineHeight = 42.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        // 2. Klasa
        Text(
            text = klasa,
            fontSize = 26.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 20.dp)
        )
        // 3. Nazwa kierunku
        Text(
            text = kierunek,
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.tertiary,
            modifier = Modifier.padding(top = 8.dp, bottom = 16.dp)
        )
        // 4. Krótki opis kierunku – najmniejszy tekst
        Text(
            text = opisKierunku,
            fontSize = 17.sp,
            lineHeight = 25.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Moja klasa")
@Composable
fun MojaKlasaPreview() {
    MojaKlasaTheme {
        MojaKlasa(
            szkola = stringResource(R.string.nazwa_szkoly),
            klasa = stringResource(R.string.klasa),
            kierunek = stringResource(R.string.kierunek),
            opisKierunku = stringResource(R.string.opis_kierunku)
        )
    }
}
