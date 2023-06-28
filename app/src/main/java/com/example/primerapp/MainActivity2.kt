package com.example.primerapp

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primerapp.ui.theme.PrimerAppTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimerAppTheme {

                }
            }
        }
    }



@Composable
fun vista() {
    Column() {
        Row {
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(Color.Green))
            Column() {
                Text(text = "Titulo", modifier = Modifier
                    .padding(horizontal = 10.dp)

                )
                Text(text = "Fecha", modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 5.dp))
            }
            Spacer(modifier = Modifier
                .padding(horizontal = 100.dp))
            Button(onClick = { /*TODO*/ }) {
                Text(text = "X") }

        }
        Row() {
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "",
                modifier = Modifier
                    .width(450.dp)
                    .background(Color.Red)
                    .height(250.dp))
        }
        Row() {
            Text(text = "Texto blblblblblblblblblblblblblbllblblblb blblbl lblblb lblbl lblbl lblblblbl", modifier = Modifier
                .width(450.dp)
                .padding(vertical = 5.dp))
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    PrimerAppTheme {
        vista()

    }
}