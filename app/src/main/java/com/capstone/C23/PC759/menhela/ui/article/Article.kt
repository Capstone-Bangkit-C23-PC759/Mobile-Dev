package com.capstone.c23.pc759.menhela.ui.article

class Article {
    val title: String
    val description: String
    val imageResId: Int

    constructor(title: String, description: String, imageResId: Int) {
        this.title = title
        this.description = description
        this.imageResId = imageResId
    }
}