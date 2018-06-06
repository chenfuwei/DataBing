package com.test.mvvm.component

import android.databinding.DataBindingComponent
import com.test.mvvm.MainActivity

class ProductionComponent : DataBindingComponent{
    private val mAdapter = ProductionBindingAdapter()

    override fun getMyBindingAdapter(): MyBindingAdapter {
        return mAdapter
    }
}