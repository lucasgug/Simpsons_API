package com.lucasgugliuzza.simpsons_api.presentation

import com.lucasgugliuzza.simpsons_api.domain.SimsonsCharacterModel

data class SimsonState(

    val isloading:Boolean = false,
    val characters: List<SimsonsCharacterModel> = emptyList()


)
