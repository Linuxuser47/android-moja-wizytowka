package com.example.mojezainteresowania

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mojezainteresowania.ui.theme.MojeZainteresowaniaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MojeZainteresowaniaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MojeZainteresowania(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

/**
 * Ekran „Moje zainteresowania”:
 * grafika z zasobów, nagłówek, opis i dwa pola z umiejętnościami obok siebie.
 */
@Composable
fun MojeZainteresowania(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Grafika z folderu res/drawable
        Image(
            painter = painterResource(R.drawable.zainteresowania),
            contentDescription = stringResource(R.string.opis_grafiki),
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp)
        )

        // Nagłówek
        Text(
            text = stringResource(R.string.naglowek),
            fontSize = 30.sp,
            lineHeight = 36.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 24.dp, bottom = 12.dp)
        )

        // Krótki opis
        Text(
            text = stringResource(R.string.opis),
            fontSize = 17.sp,
            lineHeight = 25.sp,
            textAlign = TextAlign.Justify
        )

        // Dwa pola obok siebie (Row) – każde zajmuje połowę szerokości (weight)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 28.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            PoleUmiejetnosci(
                nazwa = stringResource(R.string.umiejetnosc_1),
                modifier = Modifier.weight(1f)
            )
            PoleUmiejetnosci(
                nazwa = stringResource(R.string.umiejetnosc_2),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

/** Jedno pole z nazwą umiejętności (kolorowe tło i zaokrąglone rogi). */
@Composable
fun PoleUmiejetnosci(nazwa: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(
                color = MaterialTheme.colorScheme.primaryContainer,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 12.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.umiejetnosc_etykieta),
            fontSize = 13.sp,
            color = MaterialTheme.colorScheme.onPrimaryContainer
        )
        Text(
            text = nazwa,
            fontSize = 19.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Moje zainteresowania")
@Composable
fun MojeZainteresowaniaPreview() {
    MojeZainteresowaniaTheme {
        MojeZainteresowania()
    }
}
