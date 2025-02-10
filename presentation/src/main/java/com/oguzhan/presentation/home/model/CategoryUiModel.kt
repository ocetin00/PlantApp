package com.oguzhan.presentation.home.model

import com.oguzhan.domain.model.CategoryDomainModel


data class CategoryUiModel(
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


fun CategoryDomainModel.toUiModel(): List<CategoryUiModel?> {
    return this.data.map {
        CategoryUiModel(
            it?.createdAt,
            it?.id,
            it?.image?.let { image ->
                CategoryUiModel.Image(
                    image.alternativeText,
                    image.caption,
                    image.createdAt,
                    image.ext,
                    image.formats,
                    image.hash,
                    image.height,
                    image.id,
                    image.mime,
                    image.name,
                    image.previewUrl,
                    image.provider,
                    image.providerMetadata,
                    image.size,
                    image.updatedAt,
                    image.url,
                    image.width
                )
            },
            it?.name,
            it?.publishedAt,
            it?.rank,
            it?.title,
            it?.updatedAt
        )
    }
}
