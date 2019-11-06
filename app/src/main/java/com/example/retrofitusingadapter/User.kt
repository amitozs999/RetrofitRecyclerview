package com.example.retrofitusingadapter

import com.google.gson.annotations.SerializedName


class User {


    fun getId(): Any? {
        return id

    }

    fun getUserId(): Any? {
        return userId

    }

    fun getTitle(): Any? {
        return title

    }

    fun getText(): Any? {
        return text
    }

    val userId: Int = 0

    val id: Int = 1

    val title: String? = null

    @SerializedName("body")
    val text: String? = null
}

