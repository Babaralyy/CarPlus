package com.car.carplusapp.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.car.carplusapp.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

    private lateinit var mBinding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentSplashBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {

        Handler(Looper.getMainLooper()).postDelayed({
            val action = SplashFragmentDirections.actionSplashFragmentToConnectFragment()
            findNavController().navigate(action)
        }, 1500)

    }
}