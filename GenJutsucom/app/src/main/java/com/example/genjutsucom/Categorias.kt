package com.example.genjutsucom

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Categorias (

    val id: String,
    val nombre: String,
    val image_url: String
        ) : Parcelable