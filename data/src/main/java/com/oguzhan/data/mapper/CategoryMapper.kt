package com.oguzhan.data.mapper

import com.oguzhan.data.remote.model.Category
import com.oguzhan.domain.model.CategoryDomainModel

fun Category.toDomainModel(): CategoryDomainModel {
    return CategoryDomainModel(
        data = this.data.map { dataItem ->
            dataItem?.let {
                CategoryDomainModel.Data(
                    createdAt = it.createdAt,
                    id = it.id,
                    image = it.image?.let { img ->
                        CategoryDomainModel.Data.Image(
                            alternativeText = img.alternativeText,
                            caption = img.caption,
                            createdAt = img.createdAt,
                            ext = img.ext,
                            formats = img.formats,
                            hash = img.hash,
                            height = img.height,
                            id = img.id,
                            mime = img.mime,
                            name = img.name,
                            previewUrl = img.previewUrl,
                            provider = img.provider,
                            providerMetadata = img.providerMetadata,
                            size = img.size,
                            updatedAt = img.updatedAt,
                            url = img.url,
                            width = img.width
                        )
                    },
                    name = it.name,
                    publishedAt = it.publishedAt,
                    rank = it.rank,
                    title = it.title,
                    updatedAt = it.updatedAt
                )
            }
        },
        meta = this.meta?.let { metaItem ->
            CategoryDomainModel.Meta(
                pagination = metaItem.pagination?.let { paginationItem ->
                    CategoryDomainModel.Meta.Pagination(
                        page = paginationItem.page,
                        pageCount = paginationItem.pageCount,
                        pageSize = paginationItem.pageSize,
                        total = paginationItem.total
                    )
                }
            )
        }
    )
}
