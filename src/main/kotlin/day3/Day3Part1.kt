package day3

import java.io.File

fun main(args: Array<String>) {
    println("Hello Day 3!")
//    val input = File("src/main/kotlin/day3/input").readLines().map(String::toString)
    val input = listOf("00100", "11110", "10110", "10111", "10101", "01111", "00111", "11100", "10000",
        "11001",
        "00010",
        "01010")
    val answer = testcalc3(input)
    println(answer)
}

fun testcalc3(input: List<String>) : Int {
    var gammaRate0 = 0
    var gammaRate1 = 0
    var gammaAnswer = ""
    var epsilonAnswer = ""
    var epsilonRate0 = 0
    var epsilonRate1 = 0
    var finalAnswer = 0

    val inputDataSize = input[0].length // assumes all data is the same length

    for (position in 0 until inputDataSize) {
        for (item in input) {
            if (item[position] == '0') {
                gammaRate0 += 1
            } else {
                gammaRate1 += 1
            }
        }
        if (gammaRate0 > gammaRate1) {
            gammaAnswer += '0'
        } else {
            gammaAnswer += '1'
        }
        gammaRate0 = 0
        gammaRate1 = 0
    }

    for (position in 0 until inputDataSize) {
        for (item in input) {
            if (item[position] == '0') {
                epsilonRate0 += 1
            } else {
                epsilonRate1 += 1
            }
        }
        if (epsilonRate0 < epsilonRate1) {
            epsilonAnswer += '0'
        } else {
            epsilonAnswer += '1'
        }
        epsilonRate0 = 0
        epsilonRate1 = 0
    }
    finalAnswer = Integer.parseInt(gammaAnswer,2)*Integer.parseInt(epsilonAnswer,2)
    return finalAnswer
}

//    val a = "12"
//    a.length
//
//    a[0]
// integer.parseInt