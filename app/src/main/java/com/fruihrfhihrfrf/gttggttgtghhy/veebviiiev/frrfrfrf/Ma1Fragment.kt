package com.fruihrfhihrfrf.gttggttgtghhy.veebviiiev.frrfrfrf

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fruihrfhihrfrf.gttggttgtghhy.R
import com.fruihrfhihrfrf.gttggttgtghhy.veebviiiev.ViModt6g2t2g
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Ma1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_ma1, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gyhyhyyh=context
    }

    private lateinit var gyhyhyyh: Context

    val hyyhhyhyhy by activityViewModel<ViModt6g2t2g>(named("MainModel"))

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        hyyhhyhyhy.hy2hy5y5y5(`2hy5hy5hy5hy`)

        gtijgtogtjjgtjgt()

    }

    private fun gtijgtogtjjgtjgt() {
        findNavController().navigate(R.id.action_maaamammaFragment_to_conCOnFragment)
    }

    override fun onStart() {
        super.onStart()

    }
}