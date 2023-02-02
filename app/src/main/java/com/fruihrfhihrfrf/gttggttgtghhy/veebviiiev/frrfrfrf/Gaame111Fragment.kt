package com.fruihrfhihrfrf.gttggttgtghhy.veebviiiev.frrfrfrf

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fruihrfhihrfrf.gttggttgtghhy.R
import com.fruihrfhihrfrf.gttggttgtghhy.databinding.FragmentGaame111Binding
import com.google.android.material.snackbar.Snackbar


class Gaame111Fragment : Fragment() {
    private var fragmentGaame111Binding: FragmentGaame111Binding? = null
    private val binding
        get() = fragmentGaame111Binding ?: throw RuntimeException("FragmentGaame111Binding = null")




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaame111Binding = FragmentGaame111Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.btnPlayGame.setOnClickListener {
                findNavController().navigate(R.id.action_gaame1Fragment_to_gaaame2Fragment)
            }
            binding.yhyhyyhyhyh.setOnClickListener {
                findNavController().navigate(R.id.action_gaame1Fragment_to_gaaame2Fragment)
            }







        } catch (e: Exception) {
            ujujujujuj()
        }


        super.onViewCreated(view, savedInstanceState)
    }



    private fun ghtiigthgtihgthghgth() {
        ggthhigthgth()
    }

    private fun ggthhigthgth() {
        findNavController().navigate(R.id.action_gaame1Fragment_to_gaaame2Fragment)
    }


    override fun onDestroy() {
        fragmentGaame111Binding = null
        super.onDestroy()
    }


    private fun ujujujujuj() {
        Snackbar.make(
            binding.root,
            "Error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }
}