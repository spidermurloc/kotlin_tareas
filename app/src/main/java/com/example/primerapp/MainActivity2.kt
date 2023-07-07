package com.example.primerapp

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primerapp.ui.theme.PrimerAppTheme

private val datos: List<Misdatos> = listOf(
    Misdatos(titulo = "Cierra Twitter", fecha = "7/7/23", texto = "Twitter cierra debido a la inoperancia de Elon Musk"),
    Misdatos(titulo = "Cierra Facebook", fecha = "8/8/23", texto = "Facebook cierra debido a la inoperancia de Mark Zucaritas"),
    Misdatos(titulo = "Cierra Amazon", fecha = "9/9/23", texto = "Amazon cierra debido a la inoperancia de Lex Luthor"),

)
class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimerAppTheme {
                Misdatos(datos)

                }
            }
        }
    }



@Composable
fun vista(datos: Misdatos) {
    Column() {
        Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start){
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(Color.Green))
            Column() {
                Text(datos.titulo, modifier = Modifier
                    .padding(horizontal = 10.dp)

                )
                Text(datos.fecha, modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 5.dp))
            }

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) { Button(onClick = { /*TODO*/ }) {
                Text(text = "X")} }

        }
        Row() {
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Red)
                    , contentScale = ContentScale.FillWidth)
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(datos.texto)
        }
    }
}
data class Misdatos(val titulo: String,val fecha: String,val texto: String)

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    PrimerAppTheme {
        Misdatos(datos)

    }
}

@Composable
fun Misdatos(datos: List<Misdatos>){
    LazyColumn{
        items(datos){datos ->
            vista(datos = datos)

        }
    }
}