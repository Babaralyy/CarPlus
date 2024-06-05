package com.car.carplusapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.car.carplusapp.callbacks.PackageIncludeCallback
import com.car.carplusapp.databinding.PackageIncludeLayBinding
import com.car.carplusapp.datamodels.PackageIncludeData

class PackageIncludeAdapter(private val context: Context,
                            private val optionList: MutableList<PackageIncludeData>,
                            private val packageIncludeCallback: PackageIncludeCallback): RecyclerView.Adapter<PackageIncludeAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mBinding = PackageIncludeLayBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(mBinding)
    }

    override fun getItemCount(): Int {
        return optionList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.mBinding.tvNumber.text = "-${position + 1}"
        holder.mBinding.tvOption.text = optionList[position].option

        holder.itemView.setOnClickListener {
            packageIncludeCallback.onPackageInclude(position)
        }

    }

    class ViewHolder(val mBinding: PackageIncludeLayBinding): RecyclerView.ViewHolder(mBinding.root)

}