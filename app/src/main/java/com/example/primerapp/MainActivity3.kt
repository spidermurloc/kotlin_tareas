package com.example.primerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
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
import com.example.primerapp.ui.theme.PrimerAppTheme

private val datos: List <datos_archivo> = listOf(
    datos_archivo(titulo = "Archivo 1", usuario = "Teo", fecha = "8/7/2023"),
    datos_archivo(titulo = "Archivo 2", usuario = "Teo", fecha = "10/7/2023"),
)

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimerAppTheme {
                datos_archivo(datos = datos)


            }
        }
    }
}


@Composable
fun archivo(datos: datos_archivo){
    Column() {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
            Image(painter = painterResource(id = android.R.drawable.ic_menu_sort_by_size),
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape))
            Text(text = "Buscar documentos", modifier = Modifier
                    .padding(horizontal = 10.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End){
                Image(painter = painterResource(id = android.R.drawable.ic_dialog_dialer),
                    contentDescription = "",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape))
                Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(Color.Green)
                        .padding(horizontal = 50.dp))
            }



            
        }
        
    }

}




data class datos_archivo(val titulo: String,val usuario: String,val fecha: String)

@Composable
fun datos_archivo(datos: List<datos_archivo>){
    LazyColumn{
        items(datos){datos ->
            archivo(datos = datos)

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    PrimerAppTheme {
        datos_archivo(datos)

    }
}
