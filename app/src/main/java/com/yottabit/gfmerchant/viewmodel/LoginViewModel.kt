package com.yottabit.gfmerchant.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import com.yottabit.gfmerchant.listener.AuthListener

class LoginViewModel : ViewModel() {
    var mobileNum: String? = null
    var password: String? = null
    var authListener: AuthListener? = null


    fun onLoginButtonClick(view: View) {
        if (mobileNum.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid email or password")
            return
        }
    }
}
