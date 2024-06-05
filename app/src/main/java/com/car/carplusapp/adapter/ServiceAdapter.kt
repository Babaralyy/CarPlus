package com.car.carplusapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.car.carplusapp.callbacks.PackageCallback
import com.car.carplusapp.callbacks.SwipeCallback
import com.car.carplusapp.databinding.ServiceLayBinding
import com.car.carplusapp.datamodels.ServiceData

class ServiceAdapter(
    private val context: Context,
    private val serviceList: MutableList<ServiceData>,
    private val packageCallback: PackageCallback,
    private val swipeCallback: SwipeCallback
) : RecyclerView.Adapter<ServiceAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mBinding = ServiceLayBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(mBinding)
    }

    override fun getItemCount(): Int {
        return serviceList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val service = serviceList[position]
        holder.mBinding.ivImg.setImageResource(service.img!!)
        holder.mBinding.tvValOne.text = service.val_one
        holder.mBinding.tvValTwo.text = service.val_two
        holder.mBinding.tvDigit.text = service.digit.toString()

        if (position ==0){
            holder.mBinding.vView.visibility = View.INVISIBLE
        } else {
            holder.mBinding.vView.visibility = View.VISIBLE
        }

        holder.mBinding.ivImg.setOnClickListener {
            packageCallback.onPackageClick(position)
        }


    }

    class ViewHolder(val mBinding: ServiceLayBinding) : RecyclerView.ViewHolder(mBinding.root)

    fun onSwipe(position: Int){
        swipeCallback.onSwipePackage(position)
    }

}