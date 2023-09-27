package com.lucasgugliuzza.simpsons_api.presentation


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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import coil.compose.rememberImagePainter
import com.lucasgugliuzza.simpsons_api.domain.SimsonsCharacterModel
import com.lucasgugliuzza.simpsons_api.ui.theme.BackgroundApp
import com.lucasgugliuzza.simpsons_api.ui.theme.EstadoString
import com.lucasgugliuzza.simpsons_api.ui.theme.GeneroString
import com.lucasgugliuzza.simpsons_api.ui.theme.HistoriaString
import com.lucasgugliuzza.simpsons_api.ui.theme.OcupacionString

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

//    LazyVerticalGrid(
//        modifier = Modifier
//            .fillMaxSize(),
//        columns = GridCells.Fixed(2),
//
//    ){
//
//        items(state.characters){
//
//            Column {
//                Image(
//                    painter = rememberImagePainter(data = it.Imagen),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .padding(5.dp)
//                        .size(200.dp)
//                )
//                Text(text = it.Nombre , fontSize = 24.sp, fontWeight = FontWeight.Bold)
//            }
//        }
//    }




}

@Composable
fun CardDetail(

) {

    Dialog(
        onDismissRequest = { /*TODO*/ },
        properties = DialogProperties(
            dismissOnBackPress = false,
            dismissOnClickOutside = false
        )
    ) {

        Column(
            modifier = Modifier.fillMaxWidth().background(Color.White, RoundedCornerShape(8.dp)),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = rememberImagePainter(data = "personajes.Imagen" ),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(200.dp)

                )

                Text(text = "HOMERO", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }

            Divider()

            Text(text = "personajes.Historia", color = HistoriaString)
            Text(text = "personajes.Estado", color = EstadoString)
            Text(text = "personajes.Genero", color = GeneroString)
            Text(text =" personajes.Ocupacion", color = OcupacionString)


            Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Red)) {
                    Text(text = "Cerrar")
            }
        }
    }

}

















@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    CardDetail()
}