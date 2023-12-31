package com.arif.foodpanda_home_screen_design.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arif.foodpanda_home_screen_design.data_model.PickupRestaurantDataModel
import com.arif.foodpanda_home_screen_design.data_model.PopularRestaurantDataModel
import com.arif.foodpanda_home_screen_design.databinding.PickUpRestaurantBinding
import com.arif.foodpanda_home_screen_design.databinding.PopularRestaurantDesignBinding

class PopularRestaurantAdapter (var datalist: ArrayList<PopularRestaurantDataModel>) :
    RecyclerView.Adapter<PopularRestaurantAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: PopularRestaurantDesignBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val binding = PopularRestaurantDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)


    }

    override fun getItemCount(): Int {

        return datalist.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.mainImage.setImageResource(datalist.get(position).poster)
        holder.binding.restaurentName.setText(datalist.get(position).name)

    }
}