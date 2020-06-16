package com.conways.jack.fragment

import org.junit.Test

import org.junit.Assert.*

/**
 * @author Zong
 * Created on 2020/5/20
 * Describe:
 */
class HomeFragmentTest {

    @Test
    fun onCreate() {

//        var color:Color=Color.BLUE
//
//        println(Color.values())
//        println(Color.valueOf("RED"))
//        println(color.name)
//        println(color.ordinal)

        printAllValues<Color>();

    }
    inline fun <reified T : Enum<T>> printAllValues() {
        print(enumValues<T>().joinToString { it.name })
    }



    enum class Color{
        RED,BLACK,BLUE,GREEN,WHITE
    }
}