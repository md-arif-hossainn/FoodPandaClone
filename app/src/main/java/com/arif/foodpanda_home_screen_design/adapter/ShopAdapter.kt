package com.arif.foodpanda_home_screen_design.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arif.foodpanda_home_screen_design.data_model.CuisinesDataModel
import com.arif.foodpanda_home_screen_design.data_model.ShopDataModel
import com.arif.foodpanda_home_screen_design.databinding.CuisinesDesignBinding
import com.arif.foodpanda_home_screen_design.databinding.ShopsDesignBinding

class ShopAdapter(var datalist: ArrayList<ShopDataModel>) :
    RecyclerView.Adapter<ShopAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: ShopsDesignBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val binding = ShopsDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)


    }

    override fun getItemCount(): Int {

        return datalist.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.mainImage.setImageResource(datalist.get(position).poster)
        holder.binding.firstTV.setText(datalist.get(position).name)
    }
}