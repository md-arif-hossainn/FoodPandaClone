package com.arif.foodpanda_home_screen_design.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arif.foodpanda_home_screen_design.data_model.PickupRestaurantDataModel
import com.arif.foodpanda_home_screen_design.databinding.PickUpRestaurantBinding

class PickupRestaurantAdapter (var datalist: ArrayList<PickupRestaurantDataModel>) :
    RecyclerView.Adapter<PickupRestaurantAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: PickUpRestaurantBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val binding = PickUpRestaurantBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)


    }

    override fun getItemCount(): Int {

        return datalist.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.imageConst.setImageResource(datalist.get(position).poster)
        holder.binding.restaurantNameFirstTV.setText(datalist.get(position).name)

    }
}