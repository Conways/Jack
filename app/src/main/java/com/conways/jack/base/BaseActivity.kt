package com.conways.jack.base

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 *@author Zong
 *Created on 2020/4/28
 *Describe:
 */
open class BaseActivity : AppCompatActivity() {


    open fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}