package com.example.birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource



import androidx.compose.foundation.layout.Row
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.birthday.ui.theme.BirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingWithImage(message = "Happy Birthday Sri Vidya!", from="from Charan",  modifier= Modifier)
                }
            }
        }
    }
}


@Composable
fun Greeting(message: String,from:String,modifier: Modifier =  Modifier.padding(16.dp)) {
    Column(modifier=modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = message,
            fontSize = 26.sp,
            modifier = Modifier.padding(10.dp)

        )
        Text(
            text = from,
            fontSize = 20.sp,
            modifier = Modifier.padding(10.dp)

        )
    }
}

@Composable
fun GreetingWithImage(message: String,from: String, modifier: Modifier){
    val image = painterResource(R.drawable.birthday)
    Box{
        Image(
            painter=image,
            contentDescription=null,
            contentScale=ContentScale.Crop
        )
        Greeting(message=message, from=from, modifier=Modifier)
    }
}



//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    BirthdayTheme {
//        Greeting(message="Hi", from="sai")
//    }
//}