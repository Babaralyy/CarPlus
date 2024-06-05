package com.car.carplusapp.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.car.carplusapp.R
import com.car.carplusapp.callbacks.SpecsCallback
import com.car.carplusapp.databinding.FunctionsLayBinding
import com.car.carplusapp.datamodels.FunctionData

class FunctionAdapter(private val context: Context,
                      private val functionList: MutableList<FunctionData>,
                      private val specsCallback: SpecsCallback): RecyclerView.Adapter<FunctionAdapter.ViewHolder>() {

    private val viewList: MutableList<View>
    init {
        viewList = arrayListOf()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mBinding = FunctionsLayBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(mBinding)
    }

    override fun getItemCount(): Int {
        return functionList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val function = functionList[position]
        viewList.add(holder.itemView)
        holder.mBinding.tvFunction.text = function.function

        val firstItem = viewList[0]

        if (position == 0){

            firstItem.setBackgroundResource(R.color.white)
            val textViewId = firstItem.findViewById<TextView>(R.id.tvFunction)
            textViewId.setTextColor(Color.parseColor("#000000"))
            specsCallback.onSpecsClick(position)

        }



        holder.itemView.setOnClickListener {

            for (item in viewList){

                if(viewList[holder.adapterPosition] == item) {
                    item.setBackgroundResource(R.color.white)
                    val textViewId = item.findViewById<TextView>(R.id.tvFunction)
                    textViewId.setTextColor(Color.parseColor("#000000"))

                    specsCallback.onSpecsClick(position)
                }
                else{
                    item.setBackgroundResource(R.color.black)
                    val textViewId = item.findViewById<TextView>(R.id.tvFunction)
                    textViewId.setTextColor(Color.parseColor("#ffffff"))
                }

            }
        }



    }

    class ViewHolder(val mBinding: FunctionsLayBinding): RecyclerView.ViewHolder(mBinding.root)

}