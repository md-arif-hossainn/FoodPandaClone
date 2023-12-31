package com.arif.foodpanda_home_screen_design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.arif.foodpanda_home_screen_design.adapter.CuisinesAdapter
import com.arif.foodpanda_home_screen_design.adapter.DineinAdapter
import com.arif.foodpanda_home_screen_design.adapter.LastAdapter
import com.arif.foodpanda_home_screen_design.adapter.PandaMartAdapter
import com.arif.foodpanda_home_screen_design.adapter.PickupRestaurantAdapter
import com.arif.foodpanda_home_screen_design.adapter.PopularRestaurantAdapter
import com.arif.foodpanda_home_screen_design.adapter.PopularShopAdapter
import com.arif.foodpanda_home_screen_design.adapter.ShopAdapter
import com.arif.foodpanda_home_screen_design.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pickUpRestaurantRV.layoutManager = LinearLayoutManager(this,
        LinearLayoutManager.HORIZONTAL,false)
        val pickupRestaurantAdapter = PickupRestaurantAdapter(DataSet.pickupRestaurantDataModel) // Replace DataSet.parentList with your data
        binding.pickUpRestaurantRV.adapter = pickupRestaurantAdapter

        binding.cuisinesRV.layoutManager = LinearLayoutManager(this,
        LinearLayoutManager.HORIZONTAL,false)
        val cuisinesAdapter = CuisinesAdapter(DataSet.cuisinesDataModel) // Replace DataSet.parentList with your data
        binding.cuisinesRV.adapter = cuisinesAdapter

        binding.popularRestaurantsRV.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,false)
        val popularRestaurantAdapter = PopularRestaurantAdapter(DataSet.popularRestaurantData) // Replace DataSet.parentList with your data
        binding.popularRestaurantsRV.adapter = popularRestaurantAdapter

        binding.lastRV.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,false)
        val lastAdapter = LastAdapter(DataSet.lastDataModel) // Replace DataSet.parentList with your data
        binding.lastRV.adapter = lastAdapter

        binding.popularShopRV.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,false)
        val popularShopDataModel = PopularShopAdapter(DataSet.popularShopDataModel) // Replace DataSet.parentList with your data
        binding.popularShopRV.adapter = popularShopDataModel


        binding.shopRV.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,false)
        val shopAdapter = ShopAdapter(DataSet.shopDataModel) // Replace DataSet.parentList with your data
        binding.shopRV.adapter = shopAdapter


        binding.pandaMartRV.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,false)
        val pandaMartAdapter = PandaMartAdapter(DataSet.pandamartDataModel) // Replace DataSet.parentList with your data
        binding.pandaMartRV.adapter = pandaMartAdapter


        binding.dineInRV.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,false)
        val dineinAdapter = DineinAdapter(DataSet.dineinDataModel) // Replace DataSet.parentList with your data
        binding.dineInRV.adapter = dineinAdapter

    }
}