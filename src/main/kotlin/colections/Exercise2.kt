package org.ies.tierno.colections

fun first(list: List<String>): String = list.first()

fun main() {
    val languages = listOf<String>("Java", "Kotlin", "Go", "Python", "C++")

    println(languages.first())
}