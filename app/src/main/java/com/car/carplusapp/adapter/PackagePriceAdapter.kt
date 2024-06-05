package com.car.carplusapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.car.carplusapp.databinding.PackagePriceLayBinding
import com.car.carplusapp.datamodels.PackagePriceData

class PackagePriceAdapter(private val context: Context,
                          private val priceList: MutableList<PackagePriceData>): RecyclerView.Adapter<PackagePriceAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mBinding = PackagePriceLayBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(mBinding)
    }

    override fun getItemCount(): Int {
        return priceList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mBinding.tvPrice.text = priceList[position].price
    }

    class ViewHolder(val mBinding: PackagePriceLayBinding): RecyclerView.ViewHolder(mBinding.root)

}