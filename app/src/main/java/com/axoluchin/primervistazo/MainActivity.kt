package com.axoluchin.primervistazo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.axoluchin.primervistazo.ui.theme.PrimerVistazoTheme
import com.axoluchin.primervistazo.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimerVistazoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = MaterialTheme.colors.onSecondary) {
        Column {
            Text(text = "Hola, mi nombre es $name!", color = MaterialTheme.colors.primary)
            Text(text = "Hola, mi nombre es $name!", color = MaterialTheme.colors.primary)
            Text(text = "Hola, mi nombre es $name!", color = MaterialTheme.colors.primary)
            Text(text = "Hola, mi nombre es $name!", color = MaterialTheme.colors.primary)
            Button(onClick = { /*TODO*/ }, shape = Shapes.small) {
                Text(
                    text = "Los quiero amigos",
                    modifier = Modifier
                        .padding(12.dp),
                    color = MaterialTheme.colors.onPrimary
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PrimerVistazoTheme {
        Greeting("Axoluchin")
    }
}