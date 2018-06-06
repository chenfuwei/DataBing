package com.test.mvvm

import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.databinding.Observable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import com.test.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding : ActivityMainBinding ? = null
    val loginViewHelper = LoginViewHelper()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  DataBindingUtil.setContentView(this, R.layout.activity_main)

        loginViewHelper.name.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback(){
            override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
                Log.i("mvvm", "name = ${loginViewHelper.name.get()}")
            }
        })
        binding?.loginViewHelper = loginViewHelper
        loginViewHelper.name.set("ooo.....oo")
      //  loginViewHelper.name.set("ooooo1")

    }

    fun onClickView(view : View){
        //DataBindingUtil.setDefaultComponent(ProductionComponent())
        //recreate()
        loginViewHelper.name.set("hhhh")
    }

    private fun setData(){

    }

    //java 调用 kotlin的静态方法使用@JvmStatic进行修饰
     object Kk{
         @JvmStatic
        @BindingAdapter("data")
        fun setData(view: View, data : String)
        {
            when(view){
                is Button -> view.text = data
                else -> throw IllegalStateException("kkk")
            }
        }
    }


}
