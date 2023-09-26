package com.lucasgugliuzza.simpsons_api.data.dto

import com.squareup.moshi.Json

data class Doc(
    @Json(name = "Estado")
    val Estado: String,
    @Json(name = "Genero")
    val Genero: String,
    @Json(name = "Historia")
    val Historia: String,
    @Json(name = "Imagen")
    val Imagen: String,
    @Json(name = "Nombre")
    val Nombre: String,
    @Json(name = "Ocupacion")
    val Ocupacion: String,
    @Json(name = "_id")
    val _id: String,
    @Json(name = "updatedAt")
    val updatedAt: String
)