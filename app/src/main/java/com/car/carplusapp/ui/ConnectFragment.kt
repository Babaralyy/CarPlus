package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.car.carplusapp.R
import com.car.carplusapp.databinding.FragmentConnectBinding


class ConnectFragment : Fragment() {


    private lateinit var mBinding: FragmentConnectBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentConnectBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {
        mBinding.btnSignIn.setOnClickListener {
            val action = ConnectFragmentDirections.actionConnectFragmentToSignInFragment()
            findNavController().navigate(action)
        }

        mBinding.tvCreate.setOnClickListener {
            val action = ConnectFragmentDirections.actionConnectFragmentToSignUpFragment()
            findNavController().navigate(action)
        }

    }


}