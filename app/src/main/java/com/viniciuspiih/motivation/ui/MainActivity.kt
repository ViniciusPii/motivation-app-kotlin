package com.viniciuspiih.motivation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.viniciuspiih.motivation.R
import com.viniciuspiih.motivation.infra.MotivationConstants
import com.viniciuspiih.motivation.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mSecurityPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSecurityPreferences = SecurityPreferences(this)

        textName.text = mSecurityPreferences.getString(MotivationConstants.KEY.PERSON_NAME)
    }
}