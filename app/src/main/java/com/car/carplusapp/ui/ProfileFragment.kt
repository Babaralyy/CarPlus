package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.car.carplusapp.R
import com.car.carplusapp.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {


    private lateinit var mBinding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentProfileBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {

        mBinding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

      mBinding.passwordLay.setOnClickListener {
          val action = ProfileFragmentDirections.actionProfileFragmentToResetPasswordFragment2()
          findNavController().navigate(action)
      }

        mBinding.ordersLay.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileFragmentToOrdersFragment()
            findNavController().navigate(action)
        }

    }

}