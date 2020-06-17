package com.tr4n.data.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.tr4n.data.network.AppApi
import com.tr4n.data.network.ServiceGenerator
import com.tr4n.data.network.middleware.ApiInterceptor
import com.tr4n.data.network.ApiConfig
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module

val dataModule = module {
    single<Gson> {
        GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    }
    single {
        ServiceGenerator.buildRestApi(
            baseUrl = ApiConfig.BASE_URL,
            restApi = AppApi::class.java,
            gson = get(),
            interceptors = *arrayOf(
                ApiInterceptor("11705223-2e906401dbe44ed955bacd2ac"),
                HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }
            )
        )
    }
}
