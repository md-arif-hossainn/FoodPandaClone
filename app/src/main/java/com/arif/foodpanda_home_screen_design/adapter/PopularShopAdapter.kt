package com.arif.foodpanda_home_screen_design.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arif.foodpanda_home_screen_design.data_model.PickupRestaurantDataModel
import com.arif.foodpanda_home_screen_design.data_model.PopularShopDataModel
import com.arif.foodpanda_home_screen_design.databinding.DailyDealsBinding
import com.arif.foodpanda_home_screen_design.databinding.PickUpRestaurantBinding

class PopularShopAdapter (var datalist: ArrayList<PopularShopDataModel>) :
    RecyclerView.Adapter<PopularShopAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: DailyDealsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val binding = DailyDealsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)


    }

    override fun getItemCount(): Int {

        return datalist.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.mainImage.setImageResource(datalist.get(position).poster)
        holder.binding.dealTitle.setText(datalist.get(position).name)

    }
}