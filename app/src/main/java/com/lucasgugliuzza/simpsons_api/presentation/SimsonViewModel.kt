package com.lucasgugliuzza.simpsons_api.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lucasgugliuzza.simpsons_api.data.api.SimsonApi
import com.lucasgugliuzza.simpsons_api.domain.repository.SimsonRepository
import kotlinx.coroutines.launch

class SimsonViewModel(
   private val repository: SimsonRepository = SimsonRepository(SimsonApi.instance)
) : ViewModel() {

   var state by mutableStateOf(SimsonState())
    private set


    init {
        viewModelScope.launch {
            state =state.copy(isloading = true)

            repository.getCharacters().onSuccess {
            state = state.copy(
                isloading = false,
                characters = it
            )

            }.onFailure {
                println("Error")
            }
            state =state.copy(isloading = false)
        }
    }

}