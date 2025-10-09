package com.example.halloween

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.halloween.ui.theme.light_gray
import com.example.halloween.ui.theme.light_green

@Composable
fun LoginHalloween(navController: NavController) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 25.dp, vertical = 20.dp)
            .background(color = Color.White)
    ) {
        Spacer(Modifier.weight(0.3f))

        Row(
            Modifier.fillMaxWidth(),
        ) {
            Icon(
                painter = painterResource(R.drawable.back),
                contentDescription = null,
                Modifier.size(25.dp),
                tint = Color(0xFF464646)
            )
        }

        Spacer(Modifier.height(15.dp))

        Image(
            painter = painterResource(R.drawable.sweet_franky),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()   // 80% of screen width
                .align(Alignment.CenterHorizontally) // Optional: Center horizontally
        )

        Spacer(Modifier.weight(0.4f))

        Text(
            text = "Login",
            fontSize = 33.sp,
            fontWeight = FontWeight.Bold,
            color = light_gray
        )

        Spacer(Modifier.weight(0.55f))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            Modifier.fillMaxWidth(),
            label = {
                Text(
                    text = "email ID",
                    color = light_gray,
                    fontSize = 12.sp
                )
            },
            leadingIcon = {
                Image(
                    painter = painterResource(R.drawable.at_symbol),
                    contentDescription = null,
                )
            },
            shape = RoundedCornerShape(10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFC9C9C9),
                unfocusedBorderColor = Color(0xFFC9C9C9)
            )
        )

        Spacer(Modifier.weight(0.15f))

        OutlinedTextField(
            value = password,
            onValueChange = { password =  it},
            Modifier.fillMaxWidth(),
            label = {
                Text(
                    text = "Password",
                    color = light_gray,
                    fontSize = 12.sp
                )
            },
            shape = RoundedCornerShape(10.dp),
            leadingIcon = {
                Image(
                    painter = painterResource(R.drawable.lock),
                    contentDescription = null
                )
            },
            trailingIcon = {
                Image(
                    painter = painterResource(R.drawable.eye_closed),
                    contentDescription = null
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFC9C9C9),
                unfocusedBorderColor = Color(0xFFC9C9C9)
            )
        )

        Spacer(Modifier.weight(0.2f))

        Text(
            text = "Forget Password?",
            Modifier.align(Alignment.End),
            fontWeight = FontWeight.Bold,
            color = light_green,
            fontSize = 15.sp
        )

        Spacer(Modifier.weight(0.35f))

        Button(
            onClick = {},
            Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = light_green)
        ) {
            Text(
                text = "Continue"
            )
        }

        Spacer(Modifier.weight(0.40f))

        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Divider(
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp),
                color = Color.Gray
            )

            Text(
                text = "  or  ",
                color = Color.Gray,
                fontSize = 16.sp
            )

            Divider(
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp),
                color = Color.Gray
            )
        }

        Spacer(Modifier.weight(0.35f))

        Button(
            onClick = {
                navController.navigate("signup")
            },
            Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD0D0D0)),

            ) {
            Box(Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(R.drawable.google),
                    contentDescription = null,
                    Modifier.align(Alignment.CenterStart)
                )


                Text(
                    text = "Login with Google",
                    color = light_gray,
                    modifier = Modifier.align(Alignment.Center)
                )
            }

        }

        Spacer(Modifier.weight(1f))

        Text(
//           text = "Heritage we seen you around hare before",
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = light_gray)) {
                    append("Heritage we seen you around hare before ")
                }

                withStyle(style = SpanStyle(color = light_green, fontWeight = FontWeight.Bold)) {
                    append("Join Our Covert")
                }
            },
            color = light_gray,
            fontSize = 13.sp
        )

    }
}


@Preview(showBackground = true, device = "id:pixel_3")
@Composable
fun Preview() {
    val navController = rememberNavController()
    LoginHalloween(navController)
}