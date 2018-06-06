package com.test.mvvm.component

import android.widget.TextView
import com.test.mvvm.R

class TestBindingAdapter : MyBindingAdapter() {
    override fun setText(view: TextView, value: String) {
        view.text = "$value test"
    }

    override fun setTextColor(view: TextView, value: Int) {
        if (value == view.context
                        .resources
                        .getColor(R.color.colorAccent)) {
            view.setTextColor(view.context
                    .resources
                    .getColor(R.color.colorPrimary));
        }    }
}