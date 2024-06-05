package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.car.carplusapp.R
import com.car.carplusapp.databinding.FragmentResetPasswordBinding


class ResetPasswordFragment : Fragment() {

    private lateinit var mBinding: FragmentResetPasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentResetPasswordBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {
        mBinding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        mBinding.btnEnter.setOnClickListener {
            findNavController().popBackStack()
        }

    }

}