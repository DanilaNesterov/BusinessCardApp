package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                BusinessCardApp()
            }
        }
    }
}

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {

    Surface(
        color = Color(0xFFD2E8D4),
        modifier = modifier
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            AndroidLogoAndFullName(modifier = Modifier.weight(1f))

            ContactInfo(modifier = Modifier.padding(bottom = 36.dp))
        }

    }

}

@Composable
fun AndroidLogoAndFullName(
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Surface(
            color = Color(0xFF073042)
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "android_logo",
                modifier = Modifier.size(120.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Danila Nesterov",
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Android Developer",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color(0xFF006D3B)
        )

    }
}


@Composable
fun ContactInfo(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = modifier
    ) {
        Row {
            Icon(imageVector = Icons.Default.Call, contentDescription = "phone_number", tint = Color(0xFF006D3B))
            Spacer(Modifier.width(16.dp))
            Text(
                text = "+ 7 (983) 306 00 07",
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            Icon(imageVector = Icons.Default.Email, contentDescription = "email", tint =  Color(0xFF006D3B))
            Spacer(Modifier.width(16.dp))
            Text(
                text = "dani.nesterovv@gmail.com",
                fontSize = 20.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AndroidLogoAndFullNamePreview() {
    AppTheme {
        AndroidLogoAndFullName(
            modifier = Modifier
                .fillMaxSize()

        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    AppTheme {
        BusinessCardApp(
            modifier = Modifier
                .fillMaxSize()

        )
    }
}