package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.car.carplusapp.R
import com.car.carplusapp.databinding.ActivityMainBinding
import com.car.carplusapp.databinding.FragmentConnectionBinding


class ConnectionFragment : Fragment() {


    private lateinit var mBinding: FragmentConnectionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentConnectionBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {
        mBinding.btnEnter.setOnClickListener {
            val action = ConnectionFragmentDirections.actionConnectionFragmentToResetPasswordFragment()
            findNavController().navigate(action)
        }
    }

}