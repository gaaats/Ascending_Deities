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
import com.fruihrfhihrfrf.gttggttgtghhy.cocococo.HHfhrhfrhhfr.hyjjujujujuj
import com.fruihrfhihrfrf.gttggttgtghhy.veebviiiev.ViModt6g2t2g
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Con1Fragment : Fragment() {


    lateinit var hyujjuuj5: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_con1, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nyhnyhyhnhynnhy.gntjtgitg.observe(viewLifecycleOwner) {
            if (it!=null) {
                hyujjuuj5 = it.`2hy5hy5`
                hykhyhyhy.edit().putString(hyjjujujujuj, hyujjuuj5).apply()
                gjtojtjjtgjgtjigthgt()
            }
        }
    }

    private fun gjtojtjjtgjgtjigthgt() {
        findNavController().navigate(R.id.action_conCOnFragment_to_seciiManFragment)
    }

    private lateinit var mContext: Context


    val hykhyhyhy: SharedPreferences by inject(named("SharedPreferences"))
    val nyhnyhyhnhynnhy by activityViewModel<ViModt6g2t2g>(named("MainModel"))
}