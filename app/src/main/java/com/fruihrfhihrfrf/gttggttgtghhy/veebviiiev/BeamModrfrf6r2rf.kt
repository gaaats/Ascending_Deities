package com.fruihrfhihrfrf.gttggttgtghhy.veebviiiev


import android.webkit.WebView
import androidx.lifecycle.ViewModel
import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class BeamModrfrf6r2rf(application: Application): ViewModel() {
    val hy2hyhyhy5hy = application.packageManager
    fun h2ju5uj5u5u(webViewhhyhy: WebView): WebSettings{
       val gthyhyhyhy3 = webViewhhyhy.settings
        gthyhyhyhy3.javaScriptEnabled = true
        gthyhyhyhy3.useWideViewPort = true
        gthyhyhyhy3.loadWithOverviewMode = true
        gthyhyhyhy3.allowFileAccess = true
        gthyhyhyhy3.domStorageEnabled = true
        gthyhyhyhy3.userAgentString = gthyhyhyhy3.userAgentString.replace("; wv", "")
        gthyhyhyhy3.javaScriptCanOpenWindowsAutomatically = true
        gthyhyhyhy3.setSupportMultipleWindows(false)
        gthyhyhyhy3.displayZoomControls = false
        gthyhyhyhy3.builtInZoomControls = true
        gthyhyhyhy3.allowFileAccess = true
        gthyhyhyhy3.allowContentAccess = true
        gthyhyhyhy3.setSupportZoom(true)
        gthyhyhyhy3.pluginState = WebSettings.PluginState.ON
        gthyhyhyhy3.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        gthyhyhyhy3.cacheMode = WebSettings.LOAD_DEFAULT
        gthyhyhyhy3.allowContentAccess = true
        gthyhyhyhy3.mediaPlaybackRequiresUserGesture = false
        return gthyhyhyhy3
    }

    fun hy5hyju4uj4uj4(uri: String): Boolean {
        try {
            hy2hyhyhy5hy.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

    fun hhyvccxedrfrfrf(id: String) {
        OneSignal.setExternalUserId(
            id,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val vfbggbgttgt = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $vfbggbgttgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val vfbgnhhnnh =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $vfbgnhhnnh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val vfbggthyyhjuujki = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $vfbggthyyhjuujki"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }




}