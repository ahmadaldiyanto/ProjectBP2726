package com.example.projectbp2726

class LoginModel {
    //variabel
    var username = ""
    var password = ""

    //method/func
    fun loginCek():Boolean{
        if (username.equals("ahmad")&& password.equals("amikom")){
            return true
        }else {
            return false
        }
    }
}