package day1

import java.io.File

fun main(args: Array<String>) {
    println("Hello Day 1!")
    val input = File("src/main/kotlin/day1/input").readLines().map(String::toInt)
//    val input = listOf(1,2,3,2,5)
    println(input)

    var x= 0
    var t = 0

    for (i in input) {
        if (x<i) {
            t = t+1
        }
        x = i
    }
    println(t-1)


    // mov f i
    // test i > f
    // + prt "decreased"
}