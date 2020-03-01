package com.yottabit.gfmerchant.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.yottabit.gfmerchant.R
import com.yottabit.gfmerchant.databinding.LoginActivityBinding
import com.yottabit.gfmerchant.listener.AuthListener
import com.yottabit.gfmerchant.utils.snackbar
import com.yottabit.gfmerchant.viewmodel.LoginViewModel
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.login_activity)
        val binding: LoginActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.login_activity)
        val viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.loginViewModel = viewModel
        viewModel.authListener = this
    }

    override fun onStarted() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFailure(message: String) {
        btnLogin?.snackbar(message)
    }

    override fun gotoMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    override fun gotoRegisterActivity() {
        startActivity(Intent(this, RegisterActivity::class.java))
    }

}
