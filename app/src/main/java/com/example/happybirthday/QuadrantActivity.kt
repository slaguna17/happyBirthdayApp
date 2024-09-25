package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class QuadrantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
               Surface (
                   modifier = Modifier.fillMaxSize(),
                   color = MaterialTheme.colorScheme.background
               ) {
                   FourQuadrant()
               }
            }
        }
    }
}

@Composable
fun Quadrant(title: String,
             p: String,
             modifier: Modifier = Modifier
) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(bottom = 16.dp)


        )
        Text(
            text = p,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun FourQuadrant(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.weight(1F)
        ){
            Quadrant(
                title = "Text composable",
                p = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier
                    .weight(0.5F)
                    .background(Color(0xFFEADDFF))
            )
            Quadrant(
                title = "Image composable",
                p = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier
                    .weight(0.5F)
                    .background(Color(0xFFD0BCFF))

            )
        }
        Row (
            modifier = Modifier.weight(1F)
        ){
            Quadrant(
                title = "Row composable",
                p = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier
                    .weight(0.5F)
                    .background(Color(0xFFB69DF8))
            )
            Quadrant(
                title = "Column composable",
                p = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier
                    .weight(0.5F)
                    .background(Color(0xFFF6EDFF))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AllQuadrantsPreview() {
    HappyBirthdayTheme {
        FourQuadrant()
    }
}