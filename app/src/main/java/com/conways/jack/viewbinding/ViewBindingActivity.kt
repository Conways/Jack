package com.conways.jack.viewbinding

import android.os.Bundle
import android.view.LayoutInflater
import com.conways.jack.base.BaseActivity
import com.conways.jack.databinding.ActivityViewBindingBinding

class ViewBindingActivity : BaseActivity() {


    private lateinit var viewBinding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityViewBindingBinding.inflate(LayoutInflater.from(this))
        setContentView(viewBinding.root)
        init()

    }


    fun init() {
        viewBinding.test.setOnClickListener {
        }
    }
}
