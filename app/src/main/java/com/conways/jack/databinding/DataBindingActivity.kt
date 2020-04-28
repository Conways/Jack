package com.conways.jack.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.conways.jack.R
import com.conways.jack.base.BaseActivity

class DataBindingActivity : BaseActivity() {
    private lateinit var binding: ActivityDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)

    }
}
