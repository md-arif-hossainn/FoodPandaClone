package com.arif.foodpanda_home_screen_design.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arif.foodpanda_home_screen_design.data_model.CuisinesDataModel
import com.arif.foodpanda_home_screen_design.databinding.CuisinesDesignBinding

class CuisinesAdapter (var datalist: ArrayList<CuisinesDataModel>) :
    RecyclerView.Adapter<CuisinesAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: CuisinesDesignBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val binding = CuisinesDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)


    }

    override fun getItemCount(): Int {

        return datalist.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.firstImage.setImageResource(datalist.get(position).poster)
        holder.binding.firstTV.setText(datalist.get(position).name)
        holder.binding.secondImage.setImageResource(datalist.get(position).poster2)
        holder.binding.secondTV.setText(datalist.get(position).name2)
    }
}