package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.car.carplusapp.R
import com.car.carplusapp.databinding.FragmentCompanyBinding


class CompanyFragment : Fragment() {


    private lateinit var mBinding: FragmentCompanyBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentCompanyBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {

        mBinding.ivBack.setOnClickListener {
            findNavController().popBackStack()        }

        mBinding.btnChoose.setOnClickListener {
            val action = CompanyFragmentDirections.actionCompanyFragmentToCustomerFragment()
            findNavController().navigate(action)
        }

        mBinding.ivFive.setOnClickListener {
            mBinding.ivFive.setBackgroundResource(R.drawable.image_background)
            mBinding.ivLogo.setBackgroundResource(0)
            mBinding.ivCard.setBackgroundResource(0)
            mBinding.ivBrowser.setBackgroundResource(0)
        }
        mBinding.ivLogo.setOnClickListener {
            mBinding.ivLogo.setBackgroundResource(R.drawable.image_background)
            mBinding.ivFive.setBackgroundResource(0)
            mBinding.ivCard.setBackgroundResource(0)
            mBinding.ivBrowser.setBackgroundResource(0)
        }

        mBinding.ivCard.setOnClickListener {
            mBinding.ivCard.setBackgroundResource(R.drawable.image_background)
            mBinding.ivFive.setBackgroundResource(0)
            mBinding.ivLogo.setBackgroundResource(0)
            mBinding.ivBrowser.setBackgroundResource(0)
        }

        mBinding.ivBrowser.setOnClickListener {
            mBinding.ivBrowser.setBackgroundResource(R.drawable.image_background)
            mBinding.ivFive.setBackgroundResource(0)
            mBinding.ivLogo.setBackgroundResource(0)
            mBinding.ivCard.setBackgroundResource(0)
        }


    }


}