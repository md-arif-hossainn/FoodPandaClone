package com.arif.foodpanda_home_screen_design

import android.graphics.Paint

import android.widget.TextView
import androidx.databinding.BindingAdapter


@BindingAdapter("strikeThrough")
fun TextView.strikeThrough(strikeThrough: Boolean = true) {
    this.paintFlags = this.paintFlags or
            if (strikeThrough) {
                Paint.STRIKE_THRU_TEXT_FLAG
            } else {
                Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
}