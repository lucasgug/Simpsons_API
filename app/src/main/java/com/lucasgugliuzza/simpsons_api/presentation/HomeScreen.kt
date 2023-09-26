package com.lucasgugliuzza.simpsons_api.presentation


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import com.lucasgugliuzza.simpsons_api.ui.theme.BackgroundApp

@Composable
fun HomeScreen(
    viewModel: SimsonViewModel
) {
       val state = viewModel.state


        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(BackgroundApp)
                .padding(end = 16.dp)
        ){
            items(state.characters){

                Row(modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,

                ) {

                       Image(
                           painter = rememberImagePainter(data = it.Imagen),
                           contentDescription = null,
                           modifier = Modifier
                               .padding(5.dp)
                               .size(200.dp)


                       )
                    Column() {
                        Text(text = it.Nombre , fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Estado : ${it.Estado}")
                        Text(text = "Genero : ${it.Genero}")
                        Text(text = "Ocupacion : ${it.Ocupacion}")
                    }
                }
                Divider(color = Color.Black)
            }
        }
}


















@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {

}