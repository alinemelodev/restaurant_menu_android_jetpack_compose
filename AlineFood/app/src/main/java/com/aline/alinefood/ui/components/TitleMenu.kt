package com.aline.alinefood.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aline.alinefood.ui.theme.GreenGrey40
import com.aline.alinefood.ui.theme.GreyScale40
import com.aline.alinefood.ui.theme.GreyScale80

@Composable
fun TitleMenu() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalDivider(
            Modifier
                .width(220.dp)
                .height(1.dp), color = GreyScale80)
        Text(
            modifier = Modifier.padding(top = 24.dp),
            text = "Il Nostro Menù",
            fontSize = 36.sp,
            fontWeight = FontWeight(500),
            fontFamily = FontFamily.Cursive,
            color = GreenGrey40,
        )
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = "Piatti singoli",
            fontSize = 16.sp,
            fontWeight = FontWeight(400),
            color = GreyScale40,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TitleMenuPreview() {
    TitleMenu()
}