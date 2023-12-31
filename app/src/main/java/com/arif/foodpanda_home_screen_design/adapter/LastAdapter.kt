package com.arif.foodpanda_home_screen_design.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arif.foodpanda_home_screen_design.data_model.LastDataModel
import com.arif.foodpanda_home_screen_design.data_model.PickupRestaurantDataModel
import com.arif.foodpanda_home_screen_design.databinding.AnonymousBinding
import com.arif.foodpanda_home_screen_design.databinding.PickUpRestaurantBinding

class LastAdapter (var datalist: ArrayList<LastDataModel>) :
    RecyclerView.Adapter<LastAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: AnonymousBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val binding = AnonymousBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)


    }

    override fun getItemCount(): Int {

        return datalist.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.mainImage.setImageResource(datalist.get(position).poster)
        holder.binding.price.setText(datalist.get(position).name)

    }
}