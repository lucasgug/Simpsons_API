package com.lucasgugliuzza.simpsons_api.domain

import com.squareup.moshi.Json

data class SimsonsCharacterModel(

    val Estado: String,

    val Genero: String,

    val Historia: String,

    val Imagen: String,

    val Nombre: String,

    val Ocupacion: String,
)
