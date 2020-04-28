package com.conways.jack.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

/**
 *@author Zong
 *Created on 2020/4/28
 *Describe:
 */
class User : BaseObservable() {
    var name = ObservableField<String>()
    val id = ObservableInt()
}



