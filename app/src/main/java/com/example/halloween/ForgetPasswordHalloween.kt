package com.example.halloween

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.halloween.ui.theme.light_gray
import com.example.halloween.ui.theme.light_green

@Composable
fun ForgetPasswordHalloween(navController: NavController) {
    var email by remember { mutableStateOf("") }

    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(horizontal = 25.dp, vertical = 20.dp)
    ) {
        Spacer(Modifier.height(20.dp))

        Row(
            Modifier.fillMaxWidth()
        ) {
            Icon(
                painter = painterResource(R.drawable.back),
                contentDescription = null,
                tint = Color(0xFF464646),
                modifier = Modifier.size(25.dp)
            )
        }

        Image(
            painter = painterResource(R.drawable.baby_mummy),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),)

        Spacer(Modifier.height(15.dp))

        Text(
            text = "Forgot\nPassword",
            fontSize = 33.sp,
            color = light_gray,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(30.dp))

        Text(
            text = "Don't worry, strange things happen. Please\n" +
                    "enter the email address associated with\n" +
                    "your account.",
            color = light_gray,
            modifier = Modifier.fillMaxWidth(),
            fontSize = 16.sp
        )

        Spacer(Modifier.height(30.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            Modifier.fillMaxWidth(),
            label = {
                Text(
                    text = "email ID / Mobile Number",
                    color = light_gray,
                    fontSize = 12.sp
                )
            },
            shape = RoundedCornerShape(10.dp),
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.at_symbol),
                    contentDescription = null
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFC9C9C9),
                unfocusedBorderColor = Color(0xFFC9C9C9)
            )
        )

        Spacer(Modifier.height(30.dp))

        Button(
            onClick = {
                navController.navigate("reset")
            },
            Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = light_green)
        ) {
            Text(
                text = "Submit"
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun PreviewForgetPassword() {

    val navController = rememberNavController()

    ForgetPasswordHalloween(navController)
}