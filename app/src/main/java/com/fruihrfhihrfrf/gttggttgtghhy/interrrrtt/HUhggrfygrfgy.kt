package com.fruihrfhihrfrf.gttggttgtghhy.interrrrtt

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.fruihrfhihrfrf.gttggttgtghhy.apppppiish.ApiInterface
import com.fruihrfhihrfrf.gttggttgtghhy.apppppiish.CountryRepohy2hy2hy
import com.fruihrfhihrfrf.gttggttgtghhy.apppppiish.DevRepo
import com.fruihrfhihrfrf.gttggttgtghhy.apppppiish.HostInterfacegtgtgtgt
import com.fruihrfhihrfrf.gttggttgtghhy.veebviiiev.BeamModrfrf6r2rf
import com.fruihrfhihrfrf.gttggttgtghhy.veebviiiev.ViModt6g2t2g
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



val bghtbghgtbhgth = module {
    viewModel (named("MainModel")){
        ViModt6g2t2g((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        BeamModrfrf6r2rf(get())
    }
}
fun hyhyhyhyhyjuujujfd(gyhyjuujujuj: Application): SharedPreferences {
    return gyhyjuujujuj.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun cvevg(): Gson {
    return GsonBuilder().create()
}

val vtbhgthgtbh = module {

    single  <HostInterfacegtgtgtgt> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(HostInterfacegtgtgtgt::class.java)
    }

    single <ApiInterface> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(ApiInterface::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://ascendingdeities.live/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        CountryRepohy2hy2hy(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        DevRepo(get(named("HostInter")))
    }
    single{
        cvevg()
    }
    single (named("SharedPreferences")) {
        hyhyhyhyhyjuujujfd(androidApplication())
    }
}


