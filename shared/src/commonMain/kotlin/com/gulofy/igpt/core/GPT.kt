package com.gulofy.igpt.core

import com.gulofy.igpt.core.datasource.RemoteDataSource

class GPT internal constructor(
    private val remoteDataSource: RemoteDataSource,
) {

    suspend fun postQuestion(question: String) {
        remoteDataSource.postResponse(question = question)
    }

    companion object
}