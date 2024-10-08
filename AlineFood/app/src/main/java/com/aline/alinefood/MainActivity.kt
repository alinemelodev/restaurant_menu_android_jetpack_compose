package com.aline.alinefood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.aline.alinefood.ui.screens.HomeScreen
import com.aline.alinefood.ui.theme.AlineFoodTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    AlineFoodTheme {
        Surface {
            HomeScreen()
        }
    }
}

