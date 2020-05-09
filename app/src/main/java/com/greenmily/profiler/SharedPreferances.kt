package com.greenmily.profiler

import android.content.Context

class SharedPreferances(val context: Context) {

    private val USER_SHARED_PREF = "com.greenmily.profiler.PREFERENCES"

    private val sharedPreferances =
        context.getSharedPreferences(USER_SHARED_PREF, Context.MODE_PRIVATE)

    fun fullName(KEY_NAME: String, value: String) {
        sharedPreferances.edit().putString(KEY_NAME, value).apply()
    }

    fun getFullName(KEY_NAME: String): String? {
        return sharedPreferances.getString(KEY_NAME, null)
    }

    fun eMail(KEY_NAME: String, value: String) {
        sharedPreferances.edit().putString(KEY_NAME, value).apply()
    }


    fun passWord(KEY_NAME: String, value: String) {
        sharedPreferances.edit().putString(KEY_NAME, value).apply()
    }

    fun getPassWord(KEY_NAME: String): String? {
        return sharedPreferances.getString(KEY_NAME, null)
    }

    fun confirmPassWord(KEY_NAME: String, value: String) {
        sharedPreferances.edit().putString(KEY_NAME, value).apply()
    }

    fun getConfirmPassWord(KEY_NAME: String, value: String): String? {
        return sharedPreferances.getString(KEY_NAME, null)
    }

    fun phoneNumber(KEY_NAME: String, value: String) {
        sharedPreferances.edit().putString(KEY_NAME, value).apply()
    }

    fun getPhoneNumber(KEY_NAME: String, value: String): String? {
        return sharedPreferances.getString(KEY_NAME, null)
    }

    fun getEmail(KEY_NAME: String): String? {
        return sharedPreferances.getString(KEY_NAME, null)

    }


}