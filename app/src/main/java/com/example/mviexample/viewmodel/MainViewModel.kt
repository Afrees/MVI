package com.example.mviexample.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mviexample.intent.MainIntent
import com.example.mviexample.model.MainViewState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {

    private val _state = MutableStateFlow(MainViewState()) // estado interno
    val state: StateFlow<MainViewState> = _state            // expuesto a la Vista

    // Maneja la intención del usuario
    fun handleIntent(intent: MainIntent) {
        when (intent) {
            is MainIntent.ChangeMessage -> {
                val newMessage = if (_state.value.message == "Hola Mundo") {
                    "Adiós Mundo"
                } else {
                    "Hola Mundo"
                }
                _state.value = _state.value.copy(message = newMessage)
            }
        }
    }
}