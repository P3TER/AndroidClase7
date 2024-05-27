package com.example.unknowclass.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.unknowclass.R

@Composable
fun LazyContent(navigation: NavHostController){
    Box(modifier = Modifier.fillMaxSize()){
        Row(modifier = Modifier.fillMaxSize()) {
            SimpleLazyColumn()
        }
    }
}

@Composable
fun BiggerLazyRow(){
    val items = listOf(R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3)
    
    LazyRow(modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp)){
        items(items){item ->
            Image(painter = painterResource(id = item), contentDescription = "")
        }
    }
}

@Composable
fun SimpleLazyRow(){
    val items = listOf(R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3, R.drawable.agricultura, R.drawable.agricultura2, R.drawable.agricultura3)

    LazyRow(modifier = Modifier
        .padding(10.dp)
        .height(30.dp)
        .fillMaxWidth()){
        items(items){item ->
            Image(painter = painterResource(id = item), contentDescription = "")
        }
    }
}

@Composable
fun SimpleLazyColumn(){
    val items = listOf("Tellus netus vehicula turpis viverra consequat ultrices vel ante " +
            "magna, luctus commodo euismod inceptos ultricies aliquam " +
            "condimentum vestibulum scelerisque, bibendum sociosqu " +
            "pharetra senectus eu leo sed semper."+
            "Tellus netus vehicula turpis viverra consequat ultrices vel ante " +
            "magna, luctus commodo euismod inceptos ultricies aliquam " +
            "condimentum vestibulum scelerisque, bibendum sociosqu " +
            "pharetra senectus eu leo sed semper."+
            "Tellus netus vehicula turpis viverra consequat ultrices vel ante " +
            "magna, luctus commodo euismod inceptos ultricies aliquam " +
            "condimentum vestibulum scelerisque, bibendum sociosqu " +
            "pharetra senectus eu leo sed semper."+
            "Tellus netus vehicula turpis viverra consequat ultrices vel ante " +
            "magna, luctus commodo euismod inceptos ultricies aliquam " +
            "condimentum vestibulum scelerisque, bibendum sociosqu " +
            "pharetra senectus eu leo sed semper.")

    LazyColumn(modifier = Modifier
        .padding(10.dp)
        .fillMaxHeight()){
        items(items){item ->
            SimpleLazyRow()
            BiggerLazyRow()
            Text(text = item,
                modifier = Modifier.padding(20.dp),
                textAlign = TextAlign.Justify,
                fontSize = 18.sp)

        }
    }
}
