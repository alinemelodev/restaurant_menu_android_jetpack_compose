package com.aline.alinefood.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aline.alinefood.R
import com.aline.alinefood.model.Product
import com.aline.alinefood.ui.theme.GreenGrey40
import java.math.BigDecimal

@Composable
fun ProductSection(
    title: String,
    products: List<Product>
) {
    Column {
        Text(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 8.dp),
            text = title,
            fontSize = 30.sp,
            fontWeight = FontWeight(600),
            fontFamily = FontFamily.Cursive,
            color = GreenGrey40,
        )
        LazyRow(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(products) { product ->
                ProductItem(product = product)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductSectionPreview() {
    ProductSection("Specialità della casa", products = sampleProduct)
}

val sampleProduct = listOf(
    Product(
        name = "Pizza Napoletana",
        price = BigDecimal("70.00"),
        image = R.drawable.img_pizza
    ),
    Product(
        name = "Pizza Napoletana",
        price = BigDecimal("70.00"),
        image = R.drawable.img_pizza
    ),
    Product(
        name = "Pizza Napoletana",
        price = BigDecimal("70.00"),
        image = R.drawable.img_pizza
    ),
)
