package com.artifexmundi.bale.veebviiiev.frrfrfrf

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.artifexmundi.bale.R
import com.artifexmundi.bale.cocococo.HHfhrhfrhhfr
import com.artifexmundi.bale.cocococo.HHfhrhfrhhfr.h2yy5yyyy5y
import com.artifexmundi.bale.cocococo.HHfhrhfrhhfr.juujujkiikik
import com.artifexmundi.bale.veebviiiev.ViModt6g2t2g
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SeMainFragment : Fragment() {


    val hy2yh5yh5y: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_se_main, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyhy5y5h = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hykhykhykk.bg2gb2gb5gb5.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                hy2yh5yh5y.edit().putString("mainId", main).apply()
            }
        }

        hykhykhykk.hy2hy2yh5hy5.observe(viewLifecycleOwner) {
            if (it != null) {

                hykhykokoyh = it.hyhy
                appsh2hy2hy = it.appsChecker2262
                hy5hy5hy5yh = it.view2622

                hy2yh5yh5y.edit().putString(h2yy5yyyy5y, hykhykokoyh).apply()
                hy2yh5yh5y.edit().putString(HHfhrhfrhhfr.hyjuujikikollool, appsh2hy2hy).apply()
                hy2yh5yh5y.edit().putString(juujujkiikik, hy5hy5hy5yh).apply()

                findNavController().navigate(R.id.action_seciiManFragment_to_prrrFiilFragment)
            }
        }
    }

    val hykhykhykk by activityViewModel<ViModt6g2t2g>(named("MainModel"))
    lateinit var hykhykokoyh: String
    lateinit var hy5hy5hy5yh: String
    lateinit var appsh2hy2hy: String
    private lateinit var hyhy5y5h: Context
}