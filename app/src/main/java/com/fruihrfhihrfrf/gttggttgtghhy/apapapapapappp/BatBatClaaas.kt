package com.fruihrfhihrfrf.gttggttgtghhy.apapapapapappp


import android.app.Application
import android.content.Context
import com.fruihrfhihrfrf.gttggttgtghhy.cocococo.HHfhrhfrhhfr.h2y5hy5y55y
import com.fruihrfhihrfrf.gttggttgtghhy.cocococo.HHfhrhfrhhfr.hyhyh
import com.fruihrfhihrfrf.gttggttgtghhy.cocococo.HHfhrhfrhhfr.instIdhyhy
import com.fruihrfhihrfrf.gttggttgtghhy.cocococo.HHfhrhfrhhfr.thyyh
import com.fruihrfhihrfrf.gttggttgtghhy.interrrrtt.bghtbghgtbhgth
import com.fruihrfhihrfrf.gttggttgtghhy.interrrrtt.vtbhgthgtbh
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class BatBatClaaas:Application() {


    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(thyyh)
        gtojggtgthgithgthugt()
        hyjhyjiyhjhyji()

        val hyhyhyhy = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val juujujuj2uj = getSharedPreferences("PREFS_NAME", 0)

        val hyju5uu5u = MyTracker.getTrackerParams()
        val hy2hy55uu = MyTracker.getTrackerConfig()
        val instID255juuj = MyTracker.getInstanceId(this)
        hy2hy55uu.isTrackingLaunchEnabled = true
        val IDIN2555hyhy = UUID.randomUUID().toString()

        if (juujujuj2uj.getBoolean("my_first_time", true)) {
            hyju5uu5u.setCustomUserId(IDIN2555hyhy)
            hyhyhyhy.edit().putString(h2y5hy5y55y, IDIN2555hyhy).apply()
            hyhyhyhy.edit().putString(instIdhyhy, instID255juuj).apply()
            juujujuj2uj.edit().putBoolean("my_first_time", false).apply()
        } else {
            val shIDIN2255hy = hyhyhyhy.getString(h2y5hy5y55y, IDIN2555hyhy)
            hyju5uu5u.setCustomUserId(shIDIN2255hy)
        }
        MyTracker.initTracker(hyhyh, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@BatBatClaaas)
            modules(
                listOf(
                    bghtbghgtbhgth, vtbhgthgtbh
                )
            )
        }
    }

    private fun hyjhyjiyhjhyji() {
        gtjgtuitghgt()
    }

    private fun gtjgtuitghgt() {
    }

    private fun gtojggtgthgithgthugt() {
    }
}