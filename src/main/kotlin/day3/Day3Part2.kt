package day3

import java.io.File

fun main(args: Array<String>) {
    println("Hello Day 3!")
    val input = File("src/main/kotlin/day3/input").readLines().map(String::toString)
//    val input = listOf("00100", "11110", "10110", "10111", "10101", "01111", "00111", "11100", "10000", "11001",
//        "00010", "01010")
    val answer = testcalc4(input)
    println(answer)
}

fun testcalc4(input: List<String>) : Int {
    var gammaRate0 = 0
    var gammaRate1 = 0
    var gammaAnswer = ""
    var epsilonAnswer = ""
    var epsilonRate0 = 0
    var epsilonRate1 = 0
    var epsilonCounter = 0
    var finalAnswer = 0
    var identifiedValueEpsilon : String? = null
    var identifiedValueGamma : String? = null

    val inputDataSize = input[0].length // assumes all data is the same length

    var filteredValuesGamma = mutableSetOf<String>()
    for (position in 0 until inputDataSize) {
        for (item in input) {
            if (item.startsWith(gammaAnswer)) {
                if (item[position] == '0') {
                    gammaRate0 += 1
                } else {
                    gammaRate1 += 1
                }
            } else { // item doesn't fit criteria
                if (!filteredValuesGamma.contains(item)) { // compare filtered list to item
                    filteredValuesGamma.add(item) // adds new item to filtered list
                    if (filteredValuesGamma.size == input.size-1) { // compares #items in filtered vs input lists
                        identifiedValueGamma = input.filter {!filteredValuesGamma.contains(it)}[0] // finds ID'ed item
                        break
                    }
                }
                continue
            }
        }
        if (identifiedValueGamma != null) {
            break
        }
        if (gammaRate0 > gammaRate1) {
            gammaAnswer += "0"
        } else {
            gammaAnswer += "1"
        }
        gammaRate0 = 0
        gammaRate1 = 0
    }

    var filteredValuesEpsilong = mutableSetOf<String>()
    for (position in 0 until inputDataSize) {
        for (item in input) {
            if (item.startsWith(epsilonAnswer)) {
                if (item[position] == '0') {
                    epsilonRate0 += 1
                } else {
                    epsilonRate1 += 1
                }
            } else { // item doesn't fit criteria
                if (!filteredValuesEpsilong.contains(item)) { // compare filtered list to item
                    filteredValuesEpsilong.add(item) // adds new item to filtered list
                    if (filteredValuesEpsilong.size == input.size-1) { // compares #items in filtered vs input lists
                        identifiedValueEpsilon = input.filter {!filteredValuesEpsilong.contains(it)}[0] // finds ID'ed item
                        break
                    }
                }
                continue
            }
        }
        if (identifiedValueEpsilon != null) {
            break
        }
        if (epsilonRate1 < epsilonRate0) {
            epsilonAnswer += "1"
        } else {
            epsilonAnswer += "0"
        }
        epsilonRate0 = 0
        epsilonRate1 = 0
    }
    println(identifiedValueGamma)
    println(identifiedValueEpsilon)
    finalAnswer = Integer.parseInt(gammaAnswer, 2) * Integer.parseInt(identifiedValueEpsilon, 2)
    return finalAnswer
}