package com.oguzhan.presentation.home.model

import com.oguzhan.domain.model.QuestionDomainModel

data class QuestionUiModel(
    val id: String,
    val title: String,
    val img: String
)


fun List<QuestionDomainModel>.toUiModel(): List<QuestionUiModel> {
    return this.map {
        QuestionUiModel(
            id = it.id.toString(),
            title = it.title ?: "",
            img = it.imageUri ?: ""
        )
    }
}
