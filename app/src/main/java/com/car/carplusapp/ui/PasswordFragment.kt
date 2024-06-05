package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.car.carplusapp.R
import com.car.carplusapp.databinding.FragmentPasswordBinding
import com.car.carplusapp.databinding.FragmentResetPasswordBinding


class PasswordFragment : Fragment() {

    private lateinit var mBinding: FragmentPasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentPasswordBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {
        mBinding.btnEnter.setOnClickListener {
            val action = PasswordFragmentDirections.actionResetPasswordFragmentToPackageFragment()
            findNavController().navigate(action)
        }
    }

}