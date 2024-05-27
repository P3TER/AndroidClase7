package com.example.unknowclass.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.unknowclass.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalSlider(navegation: NavHostController){
 val pagerStater = rememberPagerState(initialPage = 0) {
     3
 }
Box(modifier = Modifier
    .fillMaxSize()
    .background(Color(0xfff5f5f5))){
    HorizontalPager(state = pagerStater) {
        page ->  when(page){
            0 -> Pagina1()
            1 -> Pagina2()
            2 -> Pagina3(navegation)
        }
    }
}
}

@Composable
fun Pagina1(){
    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Top) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.agricultura), contentDescription = "", modifier = Modifier.padding(55.dp))
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Títulos",
                modifier = Modifier.padding(10.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold)
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Tellus netus vehicula turpis viverra consequat ultrices vel ante " +
                        "magna, luctus commodo euismod inceptos ultricies aliquam " +
                        "condimentum vestibulum scelerisque, bibendum sociosqu " +
                        "pharetra senectus eu leo sed semper.",
                modifier = Modifier.padding(20.dp),
                textAlign = TextAlign.Justify,
                fontSize = 18.sp
            )
        }
    }
}

@Composable
fun Pagina2(){
    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Top) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.agricultura2), contentDescription = "", modifier = Modifier.padding(60.dp))
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Títulos",
                modifier = Modifier.padding(10.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold)
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Tellus netus vehicula turpis viverra consequat ultrices vel ante " +
                        "magna, luctus commodo euismod inceptos ultricies aliquam " +
                        "condimentum vestibulum scelerisque, bibendum sociosqu " +
                        "pharetra senectus eu leo sed semper.",
                modifier = Modifier.padding(20.dp),
                textAlign = TextAlign.Justify,
                fontSize = 18.sp
            )
        }
    }
}

@Composable
fun Pagina3(navegation: NavHostController){
    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Top) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.agricultura3), contentDescription = "", modifier = Modifier.padding(40.dp))
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Títulos",
                modifier = Modifier.padding(10.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold)
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Tellus netus vehicula turpis viverra consequat ultrices vel ante " +
                        "magna, luctus commodo euismod inceptos ultricies aliquam " +
                        "condimentum vestibulum scelerisque, bibendum sociosqu " +
                        "pharetra senectus eu leo sed semper.",
                modifier = Modifier.padding(20.dp),
                textAlign = TextAlign.Justify,
                fontSize = 18.sp
            )
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            OutlinedButton(onClick = { navegation.navigate("segundaVista") }) {
                Text(text = "A la otra pagina")
            }
        }
    }
}

