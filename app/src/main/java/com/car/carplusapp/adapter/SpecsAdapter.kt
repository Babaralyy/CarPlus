package com.car.carplusapp.adapter

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.car.carplusapp.databinding.FunctionsLayBinding
import com.car.carplusapp.databinding.SpecificationLayBinding
import com.car.carplusapp.datamodels.SpecsData

class SpecsAdapter(private val context: Context,
                   private val specsList: MutableList<SpecsData>): RecyclerView.Adapter<SpecsAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mBinding = SpecificationLayBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(mBinding)
    }

    override fun getItemCount(): Int {
        return specsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val specs = specsList[position]
        holder.mBinding.tvSpecs.text = specs.specs
        if (specs.isEnglish){
            holder.mBinding.tvSpecs.gravity = Gravity.END
        } else{
            holder.mBinding.tvSpecs.gravity = Gravity.START
        }

    }

    class ViewHolder(val mBinding: SpecificationLayBinding): RecyclerView.ViewHolder(mBinding.root)

}