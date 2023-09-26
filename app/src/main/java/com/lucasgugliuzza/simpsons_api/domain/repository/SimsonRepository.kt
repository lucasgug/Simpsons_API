package com.lucasgugliuzza.simpsons_api.domain.repository

import com.lucasgugliuzza.simpsons_api.data.dto.Doc
import com.lucasgugliuzza.simpsons_api.data.api.SimsonApi
import com.lucasgugliuzza.simpsons_api.domain.SimsonsCharacterModel
import java.lang.Exception

class SimsonRepository(
    private val api : SimsonApi
) {

   suspend fun getCharacters() : Result<List<SimsonsCharacterModel>>  {


       return try {
           val response = api.getAllCharacters(170).docs
           val characters = response.map { convert(it) }
           Result.success(characters)

       }catch (e :Exception){
           Result.failure(e)
       }



   }


    private fun convert(doc: Doc) : SimsonsCharacterModel {
        return  SimsonsCharacterModel(
            Estado = doc.Estado,
            Genero = doc.Genero,
            Historia = doc.Historia,
            Imagen = doc.Imagen,
            Nombre = doc.Nombre,
            Ocupacion = doc.Ocupacion
        )
    }


}