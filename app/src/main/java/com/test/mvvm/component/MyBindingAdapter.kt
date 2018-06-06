package com.test.mvvm.component

import android.databinding.BindingAdapter
import android.widget.TextView

abstract class MyBindingAdapter {
    @BindingAdapter("android:text")
    abstract fun setText(view : TextView, value : String)

    @BindingAdapter("android:textColor")
    abstract fun setTextColor(view : TextView, value : Int)
}