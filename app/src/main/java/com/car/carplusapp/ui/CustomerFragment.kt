package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.car.carplusapp.R
import com.car.carplusapp.databinding.FragmentCustomerBinding


class CustomerFragment : Fragment() {

    private lateinit var mBinding: FragmentCustomerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentCustomerBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {

        mBinding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

        mBinding.btnEnter.setOnClickListener {
            val action = CustomerFragmentDirections.actionCustomerFragmentToInvitationFragment()
            findNavController().navigate(action)
        }
    }

}