package day1

import java.io.File

fun main(args: Array<String>) {
    println("Hello Day 1!")
    val input = File("src/main/kotlin/day1/input").readLines().map(String::toInt)
//    val input = listOf(1,2,3,2,5,10,-5,0)
    println(input)

    val result = calc(input)

    println(result)
}

fun calc(input: List<Int>) : Int {
    var previousSavedSum = 0
    var currentSum = 0
//    var x = 0
    var countingIncreasedT = 0

    for (i in 0..input.size-3) {
        currentSum = input.get(i)+input.get(i+1)+input.get(i+2)
        if (currentSum>previousSavedSum) {
            countingIncreasedT = countingIncreasedT+1
        }
        previousSavedSum = currentSum
//        x= x+1
    }

    return countingIncreasedT - 1
}