package com.car.carplusapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.car.carplusapp.R
import com.car.carplusapp.adapter.OrderAdapter
import com.car.carplusapp.databinding.FragmentOrdersBinding
import com.car.carplusapp.datamodels.OrdersData

class OrdersFragment : Fragment() {

    private lateinit var ordersList: MutableList<OrdersData>

    private lateinit var mBinding: FragmentOrdersBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentOrdersBinding.inflate(inflater)

        inIt()

        return mBinding.root
    }

    private fun inIt() {
        ordersList = arrayListOf()
        mBinding.rvOrders.layoutManager = LinearLayoutManager(requireContext())
        mBinding.rvOrders.hasFixedSize()


        ordersList.clear()
        ordersList.add(OrdersData("sample"))
        ordersList.add(OrdersData("sample"))
        ordersList.add(OrdersData("sample"))
        ordersList.add(OrdersData("sample"))
        ordersList.add(OrdersData("sample"))
        ordersList.add(OrdersData("sample"))
        ordersList.add(OrdersData("sample"))
        ordersList.add(OrdersData("sample"))
        ordersList.add(OrdersData("sample"))

        val orderAdapter = OrderAdapter(requireContext(), ordersList)
        mBinding.rvOrders.adapter = orderAdapter


        mBinding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }

    }
}