package com.example.pevgappjetpackcompose.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TimeText
import com.example.pevgappjetpackcompose.R
import com.example.pevgappjetpackcompose.presentation.theme.PevgAppJetpackComposeTheme
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import androidx.wear.compose.material.Button
import androidx.compose.material.Button
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.pevgappjetpackcompose.presentation.ui.contadorCompose

class MainActivity : ComponentActivity() {
    //val contador1 = mutableStateOf(0);
    //val contador2 = mutableStateOf(0);
    //val contador3 = mutableStateOf(0);
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //pantalla(contador1, contador2, contador3)
            pantalla()
        }
    }

    @Preview
    @Composable
    fun pantalla(){
        Column {
            contadorCompose()
            contadorCompose()
            contadorCompose()
        }
    }
}

@Composable
fun WearApp(greetingName: String) {
    PevgAppJetpackComposeTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            contentAlignment = Alignment.Center
        ) {
            TimeText()
            Greeting(greetingName = greetingName)
        }
    }
}

@Composable
fun Greeting(greetingName: String) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        color = MaterialTheme.colors.primary,
        text = stringResource(R.string.hello_world, greetingName)
    )
}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    WearApp("Preview Android")
}