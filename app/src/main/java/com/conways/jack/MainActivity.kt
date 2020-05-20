package com.conways.jack

import android.os.Bundle
import com.conways.jack.base.BaseActivity
import com.conways.jack.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil.setContentView

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
}
