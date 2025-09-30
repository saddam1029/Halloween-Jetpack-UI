package com.example.jetcompose.GlowGreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.halloween.R

@Composable
fun Screen2() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0xFFE6E7E2))
    ) {

        Spacer(modifier = Modifier.height(110.dp))

        Image(
            painter = painterResource(R.drawable.plants),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

//        Spacer(modifier = Modifier.height(110.dp))

        Column(
            Modifier.padding(horizontal = 45.dp, vertical = 90.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Discover Your Type of Plant",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2E7547),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(40.dp))

            Text(
                text = "Tips & Tricks to grow a\nhealthy plant",
                fontSize = 22.sp,
                color = Color(0xFF2E7547),
                textAlign = TextAlign.Center
            )

            Spacer(Modifier.weight(1f))

            Button(
                onClick = {},
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 35.dp),
                shape = RoundedCornerShape(18.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2E7547))
            ) {
                Text(
                    text = "Continue",
                    fontSize = 30.sp
                )
            }

        }
    }
}

@Preview
@Composable
fun Preview2() {
    Screen2()
}