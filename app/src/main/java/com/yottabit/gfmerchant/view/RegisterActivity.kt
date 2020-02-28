package com.yottabit.gfmerchant.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yottabit.gfmerchant.R
import com.yottabit.gfmerchant.databinding.RegisterActivityBinding

class RegisterActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: RegisterActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.register_activity)
    }
}