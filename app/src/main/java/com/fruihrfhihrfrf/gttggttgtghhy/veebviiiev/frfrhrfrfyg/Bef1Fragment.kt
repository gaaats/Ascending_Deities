package com.fruihrfhihrfrf.gttggttgtghhy.veebviiiev.frfrhrfrfyg

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fruihrfhihrfrf.gttggttgtghhy.R
import com.fruihrfhihrfrf.gttggttgtghhy.cocococo.HHfhrhfrhhfr.hyjuujikikollool
import com.fruihrfhihrfrf.gttggttgtghhy.veebviiiev.ViModt6g2t2g
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Bef1Fragment : Fragment() {

    override fun onStart() {
        super.onStart()

    }



    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContexthjuujuj = context
    }

    val hy2hy2yh2yh by activityViewModel<ViModt6g2t2g>(named("MainModel"))
    val hy2yh5yh5: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var hyjuujikikikikik: String
    private lateinit var mContexthjuujuj: Context

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bef1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val checkFlyhyhy = hy2yh5yh5.getString(hyjuujikikollool, null)
        val appsCamphy2yh2 = hy2yh5yh5.getString("appCamp", null)

        if (checkFlyhyhy=="1" &&appsCamphy2yh2 == null) {
            hy2hy2yh2yh.hyy5y5u5u5u(mContexthjuujuj)
            hy2hy2yh2yh.h2hy5hy5hy.observe(viewLifecycleOwner) {
                if (it != null) {
                    hyjuujikikikikik = it.toString()
                    hy2yh5yh5.edit().putString("appCamp", hyjuujikikikikik).apply()
                    findNavController().navigate(R.id.action_prrrFiilFragment_to_fillloFragment)
                }
            }
        } else {
            jgtjgttgjjgtjtgj()
        }
    }

    private fun jgtjgttgjjgtjtgj() {
        findNavController().navigate(R.id.action_prrrFiilFragment_to_fillloFragment)
    }

}