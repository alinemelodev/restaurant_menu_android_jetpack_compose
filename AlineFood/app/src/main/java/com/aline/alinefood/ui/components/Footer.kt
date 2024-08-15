package com.aline.alinefood.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aline.alinefood.R
import com.aline.alinefood.ui.theme.GreyScale40
import com.aline.alinefood.ui.theme.GreyScale80

@Composable
fun Footer() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalDivider(
            Modifier
                .width(220.dp)
                .height(1.dp), color = GreyScale80
        )
        Text(
            modifier = Modifier.padding(top = 24.dp),
            text = "Salão e Delivery",
            fontSize = 16.sp,
            fontWeight = FontWeight(600),
            color = GreyScale40,
        )
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = "Av Paulista, 00  São Paulo SP",
            fontSize = 14.sp,
            fontWeight = FontWeight(400),
            color = GreyScale40,
        )
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = "Telefone: 11 0000 0000",
            fontSize = 14.sp,
            fontWeight = FontWeight(400),
            color = GreyScale40,
        )

        Row(
            modifier = Modifier
                .padding(top = 30.dp, bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_linkedin),
                contentDescription = "in",
                Modifier
                    .size(20.dp)
            )
            Text(
                text = " aline-melo-dev",
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                color = GreyScale40,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FooterPreview() {
    Footer()
}