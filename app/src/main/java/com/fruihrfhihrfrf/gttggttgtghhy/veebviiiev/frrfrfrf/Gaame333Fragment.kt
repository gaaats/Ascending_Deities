package com.fruihrfhihrfrf.gttggttgtghhy.veebviiiev.frrfrfrf

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.fruihrfhihrfrf.gttggttgtghhy.R
import com.fruihrfhihrfrf.gttggttgtghhy.databinding.FragmentGaame333Binding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay


class Gaame333Fragment : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            lifecycleScope.launchWhenCreated {
                delay(1700)
                gjtojtgogjtjtgjitg()
            }


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun gjtojtgogjtjtgjitg() {
        findNavController().navigate(R.id.action_gaame3Fragment_to_gaame1Fragment)
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGaame333Binding = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentGaame333Binding: FragmentGaame333Binding? = null
    private val binding get() = fragmentGaame333Binding ?: throw RuntimeException("FragmentReloadBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaame333Binding = FragmentGaame333Binding.inflate(inflater, container, false)
        return binding.root
    }

}