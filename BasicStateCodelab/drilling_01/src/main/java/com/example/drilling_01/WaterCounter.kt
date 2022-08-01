package com.example.drilling_01

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.compose.material.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*


@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by remember { mutableStateOf(0) }

        if (count > 0) {
            // This text is present if the button has been clicked
            // at least once; absent otherwise
            Text("You've had $count glasses.")
        }
        Button(
            onClick = { count++ },
            Modifier.padding(top = 8.dp),
            enabled = count < 10) {
            Text("Add one")
        }
    }
}

//@Composable
//fun WaterCounter(modifier: Modifier = Modifier) {
//    Column(modifier = modifier.padding(16.dp)) {
//
//        var count by remember { mutableStateOf(0) }
//
//        Text("You've had $count glasses.")
//        Button(
//            onClick = { count++ },
//            Modifier.padding(top = 8.dp)
//        ) {
//            Text("Add one")
//        }
//    }
//}

//@Composable
//fun WaterCounter(modifier: Modifier = Modifier) {
//    Column(modifier = modifier.padding(16.dp)) {
//
//        val count: MutableState<Int> = remember { mutableStateOf(0) }
//
//        Text("You've had ${count.value} glasses.")
//        Button(onClick = { count.value++ }, Modifier.padding(top = 8.dp)) {
//            Text("Add one")
//        }
//    }
//}


//@Composable
//fun WaterCounter(modifier: Modifier = Modifier) {
//    Column(modifier = modifier.padding(16.dp)) {
//        // Changes to count are now tracked by Compose
//        val count: MutableState<Int> = mutableStateOf(0)
//
//        Text("You've had ${count.value} glasses.")
//        Button(onClick = { count.value++ }, Modifier.padding(top = 8.dp)) {
//            Text("Add one")
//        }
//    }
//}


//@Composable
//fun WaterCounter(modifier: Modifier = Modifier) {
//
//    Column(modifier = modifier.padding(16.dp)) {
//        var count = 0
//        Text("You've had $count glasses.")
//        Button(
//            onClick = { count++ },
//            Modifier.padding(top = 8.dp)) {
//            Text("Add one")
//        }
//    }
//}