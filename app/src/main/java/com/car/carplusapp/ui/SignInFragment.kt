package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.car.carplusapp.R
import com.car.carplusapp.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {

    private lateinit var mBinding: FragmentSignInBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentSignInBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {

        mBinding.btnSignIn.setOnClickListener {
            val action = SignInFragmentDirections.actionSignInFragmentToPackageFragment()
            findNavController().navigate(action)
        }

        mBinding.tvForgotPassword.setOnClickListener {
            val action = SignInFragmentDirections.actionSignInFragmentToEnterNumberFragment()
            findNavController().navigate(action)
        }


    }
}