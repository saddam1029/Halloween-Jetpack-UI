package com.example.halloween

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen1() {
    Column(
        Modifier.fillMaxSize()

    ) {
        Box(Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(R.drawable.welcome_page_background),
                contentDescription = null,
                Modifier.fillMaxSize()
            )

            Column(
                Modifier
                    .padding(horizontal = 45.dp, vertical = 80.dp)
                    .fillMaxSize()
            ) {
                Text(
                    text = "Welcome Back!",
                    fontSize = 40.sp,
                    color = Color(0xFF2E7547),
                    fontWeight = FontWeight.Bold,
                    maxLines = 1

                )

                Spacer(Modifier.height(15.dp))

                Text(
                    text = "we're glad that that\nyou are here..!!",
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Italic,
                    color = Color(0xFF2E7547),
                    maxLines = 1
                )

                Spacer(modifier = Modifier.weight(1f)) // Pushes everything below to the bottom


                Button(
                    onClick = {},
                    Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RoundedCornerShape(18.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2E7547))
                ) {
                    Text(
                        text = "Lets get started",
                        fontSize = 30.sp
                    )
                }
            }
        }
    }
}

@Preview(device = "id:pixel_3")
@Composable
fun Preview1() {
    Screen1()
}
