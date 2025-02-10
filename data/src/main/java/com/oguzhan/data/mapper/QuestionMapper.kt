package com.oguzhan.data.mapper

import com.oguzhan.data.remote.model.Question
import com.oguzhan.domain.model.QuestionDomainModel

fun List<Question>.toDomainModel(): List<QuestionDomainModel> {
    return this.map {
        QuestionDomainModel(
            id = it.id,
            title = it.title,
            imageUri = it.imageUri,
            order = it.order,
            subtitle = it.subtitle,
            uri = it.uri
        )
    }
}