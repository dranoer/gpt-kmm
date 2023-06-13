package com.gulofy.igpt.core.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChatResponse(
    @SerialName("id") val id: String,
    @SerialName("object") val title: String,
    @SerialName("choices") val choices: List<Choice>,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ChatResponse

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}

@Serializable
data class Choice(
    @SerialName("index") val index: Int,
    @SerialName("message") val messages: List<ResponseMessage>,
)

@Serializable
data class ResponseMessage(
    @SerialName("role") val role: String,
    @SerialName("content") val content: String,
)