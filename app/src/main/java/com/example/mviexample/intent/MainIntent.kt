package com.example.mviexample.intent

// Acciones que el usuario puede realizar en la pantalla
sealed class MainIntent {
    object ChangeMessage : MainIntent()
}