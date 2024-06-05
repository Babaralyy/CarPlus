package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import com.car.carplusapp.R
import com.car.carplusapp.datamodels.ServiceData
import com.car.carplusapp.adapter.ServiceAdapter
import com.car.carplusapp.callbacks.PackageCallback
import com.car.carplusapp.callbacks.SwipeCallback
import com.car.carplusapp.callbacks.SwipeToPackageCallback
import com.car.carplusapp.databinding.FragmentPackageBinding
import com.car.carplusapp.utils.Constant

class PackageFragment : Fragment(), PackageCallback, SwipeCallback {

    private lateinit var serviceList: MutableList<ServiceData>
    private lateinit var serviceAdapter: ServiceAdapter

    private lateinit var mBinding: FragmentPackageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentPackageBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {



        serviceList = arrayListOf()
        serviceList.clear()
        serviceList.add(ServiceData(R.drawable.havak_new, "ש\"ח לחודש","SAFETY PACKAGE",119))
        serviceList.add(ServiceData(R.drawable.img, "ש\"ח לחודש","ENTERTAINMENT PACKAGE", 174))
        serviceList.add(ServiceData(R.drawable.img_, "ש\"ח לחודש","CONVENIENCE PACKAGE",146))
        serviceList.add(ServiceData(R.drawable.img_seat, "ש\"ח לחודש","PREMIUM PACKAGE",362))

        mBinding.rvService.layoutManager = LinearLayoutManager(requireContext())
        mBinding.rvService.hasFixedSize()

        serviceAdapter = ServiceAdapter(requireContext(), serviceList, this, this)
        mBinding.rvService.adapter = serviceAdapter

        val swipeToPackageCallback = SwipeToPackageCallback(serviceAdapter)
        val itemTouchHelper = ItemTouchHelper(swipeToPackageCallback)
        itemTouchHelper.attachToRecyclerView(mBinding.rvService)

        mBinding.ivProfile.setOnClickListener {
            val action = PackageFragmentDirections.actionPackageFragmentToProfileFragment()
            findNavController().navigate(action)
        }
    }

    override fun onPackageClick(position: Int) {
        val action = PackageFragmentDirections.actionPackageFragmentToCompanyFragment()
        findNavController().navigate(action)
    }

    override fun onSwipePackage(position: Int) {

        Constant.packagePosition = position

        val action = PackageFragmentDirections.actionPackageFragmentToProductDetailFragment()
        findNavController().navigate(action)
    }

}