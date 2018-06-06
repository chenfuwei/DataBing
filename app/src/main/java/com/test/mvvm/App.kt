package com.test.mvvm

import android.app.Application
import android.databinding.DataBindingUtil
import com.test.mvvm.component.TestComponent

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        DataBindingUtil.setDefaultComponent(TestComponent())
    }
}