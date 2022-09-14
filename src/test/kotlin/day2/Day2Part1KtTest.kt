package day2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day2Part1KtTest {

    @Test
    fun forwardTest() {
        val input = listOf("forward 1", "forward 2")
        val expectedOutput = 3
        assertEquals(expectedOutput, testcalc(input))
    }

    @Test
    fun forwardTest1() {
        val input = listOf("forward 1", "forward 2", "down 3", "up 1")
        val expectedOutput = 6
        assertEquals(expectedOutput, testcalc(input))
    }
}