package com.artifexmundi.bale.openurl

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.artifexmundi.bale.cocococo.HHfhrhfrhhfr.aps_idhyhy2hy
import com.artifexmundi.bale.cocococo.HHfhrhfrhhfr.frgtgttggt
import com.artifexmundi.bale.cocococo.HHfhrhfrhhfr.h2y5hy5y55y
import com.artifexmundi.bale.databinding.ActivityVivatBinding
import com.artifexmundi.bale.veebviiiev.BeamModrfrf6r2rf
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class VivatActivity : AppCompatActivity() {





    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != vfbgbgttggt || vfbffrgyurfghgtgt == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var resultshy2hy2hy26: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (hyhujujuj26 != null) {
                    resultshy2hy2hy26 = arrayOf(Uri.parse(hyhujujuj26))
                }
            } else {
                val dataStringhy2hy26hy2hy = data.dataString
                if (dataStringhy2hy26hy2hy != null) {
                    resultshy2hy2hy26 = arrayOf(Uri.parse(dataStringhy2hy26hy2hy))
                }
            }
        }
        vfbffrgyurfghgtgt!!.onReceiveValue(resultshy2hy2hy26)
        vfbffrgyurfghgtgt = null
        return
    }

    inner class CustomViewgtgt62: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (bhhjjuuj2.hy5hyju4uj4uj4(url)) {

                    val h25hy5hy5hyhy = Intent(Intent.ACTION_VIEW)
                    h25hy5hy5hyhy.data = Uri.parse(url)
                    startActivity(h25hy5hy5hyhy)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            h2juuj5uj5u(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@VivatActivity, description, Toast.LENGTH_SHORT).show()
        }
    }


    inner class ChromeClient36255hyhyhy : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            vfbffrgyurfghgtgt?.onReceiveValue(null)
            vfbffrgyurfghgtgt = filePath
            var hyjjujuuj: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (hyjjujuuj!!.resolveActivity(packageManager) != null) {
                var hyjujuj: File? = null
                try {
                    hyjujuj = hyhyhyhy()
                    hyjjujuuj.putExtra("PhotoPath", hyhujujuj26)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (hyjujuj != null) {
                    hyhujujuj26 = "file:" + hyjujuj.absolutePath
                    hyjjujuuj.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(hyjujuj)
                    )
                } else {
                    hyjjujuuj = null
                }
            }
            val bnhhnnh = Intent(Intent.ACTION_GET_CONTENT)
            bnhhnnh.addCategory(Intent.CATEGORY_OPENABLE)
            bnhhnnh.type = "image/*"
            val hyhjuujuj: Array<Intent?> = hyjjujuuj?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val gthyhyhy = Intent(Intent.ACTION_CHOOSER)
            gthyhyhy.putExtra(Intent.EXTRA_INTENT, bnhhnnh)
            gthyhyhy.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            gthyhyhy.putExtra(Intent.EXTRA_INITIAL_INTENTS, hyhjuujuj)
            startActivityForResult(gthyhyhy, vfbgbgttggt)
            return true
        }

        fun hyhyhyhy(): File? {
            val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val imageFileName = "JPEG_" + timeStamp + "_"
            val storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                imageFileName,
                ".jpg",
                storageDir
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        jujujkifvb = ActivityVivatBinding.inflate(layoutInflater)
        bnhmhykhypkoy = WebView(this)
        setContentView(bnhmhykhypkoy)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(bnhmhykhypkoy, true)
        bhhjjuuj2.h2ju5uj5u5u(bnhmhykhypkoy)

        bnhmhykhypkoy.webViewClient = CustomViewgtgt62()
        bnhmhykhypkoy.webChromeClient = ChromeClient36255hyhyhy()
        bnhmhykhypkoy.loadUrl(gthybvffvvffv())
    }

    private fun gthybvffvvffv(): String {

        val cddsxcdcddc = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val cdvfbggbbg = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)

        val vfbgnhhnnh = cdvfbggbbg.getString(frgtgttggt, null)
        val bgnhnhnhnh = cdvfbggbbg.getString(h2y5hy5y55y, null)
        val bgnhnhnmj = cdvfbggbbg.getString(aps_idhyhy2hy, null)


        when (cdvfbggbbg.getString("WebInt", null)) {
            "campaign" -> {
                bhhjjuuj2.hhyvccxedrfrfrf(bgnhnhnmj.toString())
            }
            "deepLink" -> {

                bhhjjuuj2.hhyvccxedrfrfrf(bgnhnhnmj.toString())
            }
            "deepLinkNOApps" -> {

                bhhjjuuj2.hhyvccxedrfrfrf(bgnhnhnhnh.toString())
            }
            "geo" -> {

                bhhjjuuj2.hhyvccxedrfrfrf(bgnhnhnhnh.toString())
            }
        }

        return cddsxcdcddc.getString("SAVED_URL", vfbgnhhnnh).toString()
    }

    var hy2yh5yh5hy5 = ""
    fun h2juuj5uj5u(hy2hy5yh5yh: String?) {
        if (!hy2hy5yh5yh!!.contains("t.me")) {

            if (hy2yh5yh5hy5 == "") {
                hy2yh5yh5hy5 = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    hy2hy5yh5yh
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", hy2hy5yh5yh)
                ededededededed.apply()
            }
        }
    }
    private var sashshs = false
    override fun onBackPressed() {

        if (bnhmhykhypkoy.canGoBack()) {
            if (sashshs) {
                bnhmhykhypkoy.stopLoading()
                bnhmhykhypkoy.loadUrl(hy2yh5yh5hy5)
            }
            this.sashshs = true
            bnhmhykhypkoy.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                sashshs = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


    private lateinit var jujujkifvb: ActivityVivatBinding
    lateinit var bnhmhykhypkoy: WebView
    private var vfbffrgyurfghgtgt: ValueCallback<Array<Uri>>? = null
    private var hyhujujuj26: String? = null
    private  val vfbgbgttggt = 1

    private val bhhjjuuj2 by viewModel<BeamModrfrf6r2rf>(
        named("BeamModel")
    )
}

