package com.gulofy.igpt.core

import android.content.Context
import com.gulofy.igpt.core.datasource.RemoteDataSource
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier

fun GPT.Companion.create(context: Context, withLog: Boolean) = GPT(
    RemoteDataSource(
        AndroidHttpClient(withLog),
    )
).also {
    if (withLog) Napier.base(DebugAntilog())
}