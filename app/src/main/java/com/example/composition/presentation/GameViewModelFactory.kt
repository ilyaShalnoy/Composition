package com.example.composition.presentation

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.composition.domain.entity.Level
import java.lang.RuntimeException

class GameViewModelFactory(
    private val context: Application,
    private val level: Level
): ViewModelProvider.Factory {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)){
            return GameViewModel(context,level) as T
        }
        throw RuntimeException("Unknown view model $modelClass")
    }
}