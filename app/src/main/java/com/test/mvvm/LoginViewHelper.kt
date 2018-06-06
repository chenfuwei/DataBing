package com.test.mvvm

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableField

class LoginViewHelper : BaseObservable(){
    var name : ObservableField<String> = ObservableField("chenfuwei")
    var pwd : ObservableField<String> = ObservableField("kkk")


}