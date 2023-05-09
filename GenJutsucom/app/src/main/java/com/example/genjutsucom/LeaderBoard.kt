package com.example.genjutsucom

import com.google.gson.annotations.SerializedName

data class LeaderBoard (
    @SerializedName("Email") val Email: String? = "",
    @SerializedName("Score") val Score: Int? = 0
)