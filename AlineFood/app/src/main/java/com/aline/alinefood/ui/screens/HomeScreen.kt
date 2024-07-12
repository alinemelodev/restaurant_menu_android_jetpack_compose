package com.aline.alinefood.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aline.alinefood.model.appetizer
import com.aline.alinefood.model.desserts
import com.aline.alinefood.model.houseSpecialty
import com.aline.alinefood.model.pasta
import com.aline.alinefood.ui.components.Footer
import com.aline.alinefood.ui.components.Header
import com.aline.alinefood.ui.components.ProductSection
import com.aline.alinefood.ui.components.TitleMenu

@Composable
fun HomeScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Header()
        TitleMenu()
        Spacer(Modifier)
        ProductSection("Specialità della casa", products = houseSpecialty)
        ProductSection("Antipasto", products = appetizer)
        ProductSection("Paste", products = pasta)
        ProductSection("Dolci", products = desserts)
        Spacer(Modifier)
        Footer()
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
   HomeScreen()
}