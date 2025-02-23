package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(red = 210, green = 232, blue = 212))) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = "",
                modifier = Modifier
                    .background(Color(red = 7, green = 48, blue = 66))
                    .size(128.dp)
                )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = stringResource(R.string.name),
                fontSize = 38.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = stringResource(R.string.dev_extra),
                fontSize = 16.sp,
                color = Color(red = 5, green = 107, blue = 53)
            )
        }

        Column (
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 48.dp)
                .height(124.dp),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Row {
                Icon(
                    imageVector = Icons.Filled.Call,
                    contentDescription = "",
                    tint = Color(red = 0, green = 109, blue = 59))
                Spacer(modifier = Modifier.width(24.dp))
                Text(text = "+" + stringResource(R.string.phone))
            }
            Row {
                Icon(
                    imageVector = Icons.Filled.Share,
                    contentDescription = "",
                    tint = Color(red = 0, green = 109, blue = 59))
                Spacer(modifier = Modifier.width(24.dp))
                Text(text = stringResource(R.string.link))
            }
            Row {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "",
                    tint = Color(red = 0, green = 109, blue = 59))
                Spacer(modifier = Modifier.width(24.dp))
                Text(text =  stringResource(R.string.mail))
            }
        }
    }

}