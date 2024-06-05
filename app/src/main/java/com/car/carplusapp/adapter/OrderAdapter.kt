package com.car.carplusapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.car.carplusapp.databinding.OrderLayBinding
import com.car.carplusapp.datamodels.OrdersData


class OrderAdapter(private val context: Context,
                   private val ordersList: MutableList<OrdersData>): RecyclerView.Adapter<OrderAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mBinding = OrderLayBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(mBinding)
    }

    override fun getItemCount(): Int {
        return ordersList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    class ViewHolder(val mBinding: OrderLayBinding): RecyclerView.ViewHolder(mBinding.root)

}