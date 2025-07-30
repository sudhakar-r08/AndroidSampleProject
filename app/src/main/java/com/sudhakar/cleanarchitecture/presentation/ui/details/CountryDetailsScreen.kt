package com.sudhakar.cleanarchitecture.presentation.ui.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sudhakar.cleanarchitecture.domain.model.Country
import com.sudhakar.cleanarchitecture.presentation.ui.details.components.DetailCard
import com.sudhakar.cleanarchitecture.presentation.ui.details.components.DetailRow
import java.text.NumberFormat

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountryDetailsScreen(country: Country, onBackClick: () -> Unit) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = country.name) },
            navigationIcon = {
                IconButton(onClick = onBackClick) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                }
            })
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            AsyncImage(
                model = country.flag,
                contentDescription = "${country.flag} flag",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = country.name,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            DetailCard {
                DetailRow(label = "Capital", value = country.capital ?: "No Capital")
                DetailRow(label = "Region", value = country.region)
                country.subregion?.let { DetailRow(label = "Subregion", it) }
                DetailRow(
                    label = "Population",
                    value = NumberFormat.getNumberInstance().format(country.population)
                )
                country.area?.let {
                    DetailRow(
                        label = "Ares",
                        value = "${NumberFormat.getNumberInstance().format(it)} Km²"
                    )
                }
                DetailRow(
                    label = "Country Code",
                    value = "${country.alpha2Code}"
                )
            }
            country.currencies?.let { currencies ->
                Spacer(modifier = Modifier.height(16.dp))
                DetailCard {
                    Text(
                        "Currencies",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                    )
                    currencies.forEach { currency ->
                        val currencyText = buildString {
                            append(currency.name ?: "Unknown")
                            currency.code?.let { append(" ($it)") }
                            currency.symbol?.let { append(" - $it") }
                        }
                        Text(
                            text = currencyText,
                            style = MaterialTheme.typography.bodyMedium,
                            modifier = Modifier.padding(vertical = 2.dp)
                        )
                    }
                }

            }
            country.languages?.let { languages ->
                Spacer(modifier = Modifier.height(16.dp))
                DetailCard {
                    Text(
                        "Languages",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                    )
                    languages.forEach { language ->
                        val langText = buildString {
                            append(language.name ?: "Unknown")
                            language.nativeName?.let { append(" ($it)") }

                        }
                        Text(
                            text = langText,
                            style = MaterialTheme.typography.bodyMedium,
                            modifier = Modifier.padding(vertical = 2.dp)
                        )
                    }
                }
            }
        }
    }

}

