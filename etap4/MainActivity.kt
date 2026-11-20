package com.example.mojawizytowka

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mojawizytowka.ui.theme.Bursztyn
import com.example.mojawizytowka.ui.theme.Granat
import com.example.mojawizytowka.ui.theme.GranatJasny
import com.example.mojawizytowka.ui.theme.JasnyTekst
import com.example.mojawizytowka.ui.theme.MojaWizytowkaTheme
import com.example.mojawizytowka.ui.theme.StalowyTekst

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Tło wizytówki jest ciemne, więc ikony paska stanu mają być jasne
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(android.graphics.Color.TRANSPARENT),
            navigationBarStyle = SystemBarStyle.dark(android.graphics.Color.TRANSPARENT)
        )
        setContent {
            MojaWizytowkaTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Granat
                ) { innerPadding ->
                    Wizytowka(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

/** Cały ekran wizytówki: u góry dane osoby, na dole dane kontaktowe. */
@Composable
fun Wizytowka(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Granat)
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // weight(1f) – część z danymi zajmuje całe wolne miejsce nad kontaktem
        DaneOsoby(
            imie = stringResource(R.string.imie),
            kierunek = stringResource(R.string.kierunek),
            haslo = stringResource(R.string.haslo),
            modifier = Modifier.weight(1f)
        )
        Kontakt(modifier = Modifier.padding(bottom = 40.dp))
    }
}

/** Część 1: awatar, imię, kierunek kształcenia i hasło o zainteresowaniach. */
@Composable
fun DaneOsoby(
    imie: String,
    kierunek: String,
    haslo: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.awatar),
            contentDescription = stringResource(R.string.opis_awatara),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
                .border(width = 4.dp, color = Bursztyn, shape = CircleShape)
        )
        Text(
            text = imie,
            fontSize = 38.sp,
            lineHeight = 44.sp,
            fontWeight = FontWeight.Bold,
            color = JasnyTekst,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 24.dp)
        )
        Text(
            text = kierunek,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            color = Bursztyn,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 6.dp)
        )
        Text(
            text = haslo,
            fontSize = 15.sp,
            lineHeight = 22.sp,
            fontStyle = FontStyle.Italic,
            color = StalowyTekst,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)
        )
    }
}

/** Część 2: linia oddzielająca i lista danych kontaktowych. */
@Composable
fun Kontakt(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalDivider(
            modifier = Modifier.width(260.dp),
            thickness = 1.dp,
            color = GranatJasny
        )
        Spacer(modifier = Modifier.height(20.dp))
        // Wiersze wyrównane do lewej, a cały blok wyśrodkowany
        Column(horizontalAlignment = Alignment.Start) {
            KontaktWiersz(ikona = R.drawable.ic_telefon, tekst = stringResource(R.string.telefon))
            KontaktWiersz(ikona = R.drawable.ic_email, tekst = stringResource(R.string.email))
            KontaktWiersz(ikona = R.drawable.ic_kod, tekst = stringResource(R.string.github))
        }
    }
}

/** Jeden wiersz kontaktu: ikona + tekst obok siebie (Row). */
@Composable
fun KontaktWiersz(
    @DrawableRes ikona: Int,
    tekst: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(ikona),
            contentDescription = null,
            tint = Bursztyn,
            modifier = Modifier.size(22.dp)
        )
        Text(
            text = tekst,
            fontSize = 16.sp,
            color = JasnyTekst,
            modifier = Modifier.padding(start = 20.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Moja wizytówka")
@Composable
fun WizytowkaPreview() {
    MojaWizytowkaTheme {
        Wizytowka()
    }
}
