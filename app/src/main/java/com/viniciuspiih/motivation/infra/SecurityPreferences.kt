package com.viniciuspiih.motivation.infra

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {

    private val mSharedPreferences = context.getSharedPreferences("motivation", MODE_PRIVATE)

    fun storeString(key: String, value: String) {
        mSharedPreferences.edit().putString(key, value)
    }

    fun getString(key: String) {

    }
}