package com.test.mvvm.component

import android.widget.TextView

class ProductionBindingAdapter : MyBindingAdapter() {
    override fun setText(view: TextView, value: String) {
        view.text = value
    }

    override fun setTextColor(view: TextView, value: Int) {
        view.setTextColor(value)
    }
}