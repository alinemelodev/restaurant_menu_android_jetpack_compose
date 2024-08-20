package com.aline.alinefood.ui.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aline.alinefood.ui.components.Footer
import com.aline.alinefood.ui.components.Header
import com.aline.alinefood.ui.components.ProductSection
import com.aline.alinefood.ui.components.TitleMenu
import com.aline.alinefood.ui.theme.White
import sections

@Composable
fun HomeScreen() {
    LazyColumn(
        Modifier
            .fillMaxSize()
            .background(color = White),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        item {
            Header()
            TitleMenu()
            Spacer(Modifier)
        }
        item {
            var text by remember {mutableStateOf("")}
            OutlinedTextField(value = text, onValueChange = { newValue ->
                text = newValue
            })

        }
        items(sections) { section ->
            ProductSection(title = section.title, products = section.products)
        }
        item {
            Spacer(Modifier)
            Footer()
        }
    }
}





@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}