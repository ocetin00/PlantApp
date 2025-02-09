package com.oguzhan.data.remote.model


import com.google.gson.annotations.SerializedName

class Question(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("image_uri")
    val imageUri: String?,
    @SerializedName("order")
    val order: Int?,
    @SerializedName("subtitle")
    val subtitle: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("uri")
    val uri: String?
)
