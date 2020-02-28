package com.yottabit.gfmerchant.listener


interface AuthListener{
    fun onStarted()
    //fun onSuccess(user: UserX?)
    fun onFailure(message: String)
    fun gotoMainActivity()
    fun gotoRegisterActivity()
}