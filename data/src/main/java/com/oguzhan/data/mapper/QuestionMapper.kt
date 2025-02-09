package com.oguzhan.data.mapper

import com.oguzhan.data.remote.model.Question

fun Question.toDomainModel() = com.oguzhan.domain.model.QuestionDomainModel(
    id = id,
    imageUri = imageUri,
    order = order,
    subtitle = subtitle,
    title = title,
    uri = uri
)