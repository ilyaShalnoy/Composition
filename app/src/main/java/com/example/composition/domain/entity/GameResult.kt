package com.example.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class GameResult(
    val winner: Boolean,
    val countOFRightAnswer: Int,
    val countOfQuestion: Int,
    val gameSettings: GameSettings
) : Parcelable