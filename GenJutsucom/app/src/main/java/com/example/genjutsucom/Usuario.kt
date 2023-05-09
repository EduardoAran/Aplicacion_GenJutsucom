package com.example.genjutsucom

import com.google.gson.annotations.SerializedName

data class Usuario(
    @SerializedName("Email") val Email: String? = "",
    @SerializedName("Name") val Name: String? = "",
    @SerializedName("Password") val Password: String? = "",
    @SerializedName("Username") val Username: String? = "",
    @SerializedName("Gender") val Gender: String? = ""
)