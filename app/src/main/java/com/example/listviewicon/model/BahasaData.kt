package com.example.listviewicon.model

import com.example.listviewicon.R

object BahasaData {
    private val BahasaName = arrayOf(
        "Ruby",
        "Rails",
        "Python",
        "Java Script",
        "PHP"
    )
    private val detail = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language",
        "Ruby on Rails is a server-side web application development framework written in Ruby language",
        "Python is interpreted scripting end object-oriented programming language",
        "JavaScript is an object-based scripting language",
        "PHP is an interpreted language, i.e, there is no need for compilation"
    )
    private val BahasaPoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.js,
        R.drawable.php
    )
    val listBahasa: ArrayList<Bahasa>
        get() {
            val list = arrayListOf<Bahasa>()
            for (position in BahasaName.indices) {
                val bahasa_pemograman = Bahasa()
                bahasa_pemograman.name = BahasaName[position]
                bahasa_pemograman.detail = detail[position]
                bahasa_pemograman.poster = BahasaPoster[position]
                list.add(bahasa_pemograman)
            }
            return list
        }
}