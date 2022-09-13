package day1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day1Part2KtTest {

    @Test
    fun testSimple() {
        val input = listOf(1,2,3,2,5,10)
        val expectedOutput = 3

        assertEquals(expectedOutput, calc(input))
    }

    @Test
    fun testSimple1() {
        val input = listOf(1,2,3)
        val expectedOutput = 0

        assertEquals(expectedOutput, calc(input))
    }

    @Test
    fun testSimple2() {
        val input = listOf(1,2)
        val expectedOutput = -1

        assertEquals(expectedOutput, calc(input))
    }

    @Test
    fun testSimple3() {
        val input = listOf(1,2,3,2,5,10,-5,0)
        val expectedOutput = 3

        assertEquals(expectedOutput, calc(input))
    }
}