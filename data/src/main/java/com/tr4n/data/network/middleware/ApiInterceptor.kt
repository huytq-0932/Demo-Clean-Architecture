package com.tr4n.data.network.middleware

import okhttp3.Interceptor
import okhttp3.Response

internal class ApiInterceptor(private val apiKey: String) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response = chain.proceed(
        with(chain.request()) {
            newBuilder().url(
                url.newBuilder()
                    .addQueryParameter("key", apiKey)
                    .build()
            ).build()
        }
    )
}