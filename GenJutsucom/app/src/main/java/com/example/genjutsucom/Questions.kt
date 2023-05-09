package com.example.genjutsucom

import android.net.Uri
import java.net.URI

data class Questions (

    val id: Int,
    val questions: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int,
    val video: Int
    )
