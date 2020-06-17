package com.tr4n.data.network

import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Factory object to build Rest APIs and okhttp clients to use in remove module
 */
object ServiceGenerator {

    private const val CONNECT_TIMEOUT = 60000L
    private const val READ_TIMEOUT = 20000L
    private const val WRITE_TIMEOUT = 30000L

    /**
     * Builds given [T] retrofit restApi interface
     *
     * @param baseUrl [String] with a valid baseUrl including http scheme
     * @param gson
     * @param interceptors [List] of [Interceptor] to attach to the expected client
     */
    internal fun <T> buildRestApi(
        baseUrl: String,
        restApi: Class<T>,
        gson: Gson,
        vararg interceptors: Interceptor
    ): T {
        val okHttpClient = buildOkHttpClient(interceptors.toList())
        val builder = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttpClient)
            .build()
        return builder.create(restApi)
    }

    /**
     * Builds an [OkHttpClient] with the given interceptors attached to it
     *
     * @param interceptors [List] of [Interceptor] to attach to the expected client
     */
    private fun buildOkHttpClient(interceptors: List<Interceptor>): OkHttpClient =
        OkHttpClient.Builder().apply {
            for(interceptor in interceptors) addInterceptor(interceptor)
            connectTimeout(CONNECT_TIMEOUT, TimeUnit.MILLISECONDS)
            readTimeout(READ_TIMEOUT, TimeUnit.MILLISECONDS)
            writeTimeout(WRITE_TIMEOUT, TimeUnit.MILLISECONDS)
        }.build()
}
