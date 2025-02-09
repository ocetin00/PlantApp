package com.oguzhan.data.remote.model


import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("data")
    val data: List<Data?>,
    @SerializedName("meta")
    val meta: Meta?
) {
    data class Data(
        @SerializedName("createdAt")
        val createdAt: String?,
        @SerializedName("id")
        val id: Int?,
        @SerializedName("image")
        val image: Image?,
        @SerializedName("name")
        val name: String?,
        @SerializedName("publishedAt")
        val publishedAt: String?,
        @SerializedName("rank")
        val rank: Int?,
        @SerializedName("title")
        val title: String?,
        @SerializedName("updatedAt")
        val updatedAt: String?
    ) {
        data class Image(
            @SerializedName("alternativeText")
            val alternativeText: Any?,
            @SerializedName("caption")
            val caption: Any?,
            @SerializedName("createdAt")
            val createdAt: String?,
            @SerializedName("ext")
            val ext: String?,
            @SerializedName("formats")
            val formats: Any?,
            @SerializedName("hash")
            val hash: String?,
            @SerializedName("height")
            val height: Int?,
            @SerializedName("id")
            val id: Int?,
            @SerializedName("mime")
            val mime: String?,
            @SerializedName("name")
            val name: String?,
            @SerializedName("previewUrl")
            val previewUrl: Any?,
            @SerializedName("provider")
            val provider: String?,
            @SerializedName("provider_metadata")
            val providerMetadata: Any?,
            @SerializedName("size")
            val size: Double?,
            @SerializedName("updatedAt")
            val updatedAt: String?,
            @SerializedName("url")
            val url: String?,
            @SerializedName("width")
            val width: Int?
        )
    }

    data class Meta(
        @SerializedName("pagination")
        val pagination: Pagination?
    ) {
        data class Pagination(
            @SerializedName("page")
            val page: Int?,
            @SerializedName("pageCount")
            val pageCount: Int?,
            @SerializedName("pageSize")
            val pageSize: Int?,
            @SerializedName("total")
            val total: Int?
        )
    }
}