package day2

import java.io.File

fun main(args: Array<String>) {
    println("Hello Day 1!")
    val input: List<String> = File("src/main/kotlin/day2/input").readLines()
//  val input = listOf("forward 1", "forward 2", "down 3", "up 1")
    testcalc(input)
    println(input)
}


fun testcalc(input: List<String>) : Int {
    var forward = 0
    var depth = 0
    for (i in input) {
        val x = i.split(" ")
        val resultMagnitude = x[1].toInt()
        if (x[0] == "forward") {
            forward += resultMagnitude
        } else if (x[0] == "down") {
            depth += resultMagnitude
        } else {
            depth -= resultMagnitude
        }
        println(forward*depth)
    }
 //   var split = input.split





//    val s = "hello 3"
//    val r = s.split(" ")
//    println(r)
//
//    val resultS = r[0]
//    val resultI = r[1].toInt()
//
//    println(resultS)
//    println(resultI)




    return 0
}