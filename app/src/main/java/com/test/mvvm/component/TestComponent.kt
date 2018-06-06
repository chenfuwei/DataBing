package com.test.mvvm.component

import android.databinding.DataBindingComponent
import com.test.mvvm.MainActivity

class TestComponent : DataBindingComponent{
    private val mAdapter = TestBindingAdapter()
    override fun getMyBindingAdapter(): MyBindingAdapter {
        return mAdapter
    }
}