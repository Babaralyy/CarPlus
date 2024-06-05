package com.car.carplusapp.callbacks

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.car.carplusapp.adapter.ServiceAdapter

class SwipeToPackageCallback(private val serviceAdapter: ServiceAdapter):
    ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return false
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        // Remove item from adapter
        val position = viewHolder.adapterPosition
        serviceAdapter.onSwipe(position)
    }
}