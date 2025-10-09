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
import androidx.compose.runtime.MutableDoubleState
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.halloween.ui.theme.light_gray
import com.example.halloween.ui.theme.light_green

@Composable
fun SignUpHalloween(navController: NavController) {

    var email by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var number by remember { mutableStateOf("") }

    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 25.dp, vertical = 20.dp)
            .background(color = Color.White)
    ) {
        Spacer(Modifier.height(20.dp))

        Row(
            Modifier.fillMaxWidth(),
        ) {
            Icon(
                painter = painterResource(R.drawable.back),
                contentDescription = null,
                Modifier.size(20.dp),
                tint = Color(0xFF464646)
            )
        }

        Spacer(Modifier.height(15.dp))

        Image(
            painter = painterResource(R.drawable.black_cat),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()   // 80% of screen width
        )

        Spacer(Modifier.height(20.dp))

        Text(
            text = "Sign Up",
            fontSize = 33.sp,
            fontWeight = FontWeight.Bold,
            color = light_gray
        )

        Spacer(Modifier.height(40.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            Modifier.fillMaxWidth(),
            label = {
                Text(
                    text = "email ID",
                    color = light_gray
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

        Spacer(Modifier.height(10.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            Modifier.fillMaxWidth(),
            label = {
                Text(
                    text = "fill name",
                    color = light_gray
                )
            },
            shape = RoundedCornerShape(10.dp),
            leadingIcon = {
                Image(
                    painter = painterResource(R.drawable.lockperson),
                    contentDescription = null
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFC9C9C9),
                unfocusedBorderColor = Color(0xFFC9C9C9)
            )
        )

        Spacer(Modifier.height(10.dp))

        OutlinedTextField(
            value = number,
            onValueChange = { number = it },
            Modifier.fillMaxWidth(),
            label = {
                Text(
                    text = "mobile",
                    color = light_gray
                )
            },
            shape = RoundedCornerShape(10.dp),
            leadingIcon = {
                Image(
                    painter = painterResource(R.drawable.lockphone),
                    contentDescription = null
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFC9C9C9),
                unfocusedBorderColor = Color(0xFFC9C9C9)
            )
        )

        Spacer(Modifier.height(30.dp))

        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = light_gray)) {
                    append("Join our coven and accept our ")
                }
                withStyle(style = SpanStyle(color = light_green, fontWeight = FontWeight.Bold)) {
                    append("Terms & Conditions")
                }
                withStyle(style = SpanStyle(color = light_gray)) {
                    append(" and\n")
                }
                withStyle(style = SpanStyle(color = light_green, fontWeight = FontWeight.Bold)) {
                    append("Privacy Policy")
                }
                withStyle(style = SpanStyle(color = light_gray)) {
                    append(". Don't be afraid, we don't bite!")
                }
            },
            modifier = Modifier.fillMaxWidth(),
            fontSize = 14.sp
        )


        Spacer(Modifier.height(35.dp))

        Button(
            onClick = {
                navController.navigate("forget")
            },
            Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = light_green)
        ) {
            Text(
                text = "Continue"
            )
        }

        Spacer(Modifier.height(25.dp))

        Text(
//            text = "Are you a familiar spirit? Log In again and join our\n" +
//                    "Halloween party",
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = light_gray)){
                    append("Are you a familiar spirit? ")
                }

                withStyle(style = SpanStyle(color = light_green, fontWeight = FontWeight.Bold)){
                    append("Log In ")
                }

                withStyle(style = SpanStyle(color = light_gray)){
                    append("again and join our\nHalloween party?")
                }
            },
            color = light_gray,
            modifier = Modifier.fillMaxWidth(),
            fontSize = 13.sp,
            textAlign = TextAlign.Center
        )

    }
}


@Preview(showBackground = true)
@Composable
fun PreviewSignUp() {
    val navController = rememberNavController()
    SignUpHalloween(navController)
}