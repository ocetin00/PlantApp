package com.oguzhan.domain.model

data class CategoryDomainModel(
    val data: List<Data?>,
    val meta: Meta?
) {
    data class Data(
        val createdAt: String?,
        val id: Int?,
        val image: Image?,
        val name: String?,
        val publishedAt: String?,
        val rank: Int?,
        val title: String?,
        val updatedAt: String?
    ) {
        data class Image(
            val alternativeText: Any?,
            val caption: Any?,
            val createdAt: String?,
            val ext: String?,
            val formats: Any?,
            val hash: String?,
            val height: Int?,
            val id: Int?,
            val mime: String?,
            val name: String?,
            val previewUrl: Any?,
            val provider: String?,
            val providerMetadata: Any?,
            val size: Double?,
            val updatedAt: String?,
            val url: String?,
            val width: Int?
        )
    }

    data class Meta(
        val pagination: Pagination?
    ) {
        data class Pagination(
            val page: Int?,
            val pageCount: Int?,
            val pageSize: Int?,
            val total: Int?
        )
    }
}
