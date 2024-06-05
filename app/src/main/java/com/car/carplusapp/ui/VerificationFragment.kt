package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.car.carplusapp.R
import com.car.carplusapp.databinding.FragmentVerificationBinding

class VerificationFragment : Fragment() {


    private lateinit var mBinding: FragmentVerificationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentVerificationBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {
        mBinding.btnEnter.setOnClickListener {
            val action = VerificationFragmentDirections.actionVerificationFragmentToPackageFragment()
            findNavController().navigate(action)
        }
    }


}