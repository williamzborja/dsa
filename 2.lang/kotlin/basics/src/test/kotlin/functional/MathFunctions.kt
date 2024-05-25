package functional

import kotlin.test.Test
import java.util.function.Function
import kotlin.streams.asSequence
import kotlin.test.assertEquals

class MathFunctions {

    @Test
    fun testMathFunctions_1() {
        val square: Function<Int, Int> = Function { it * it }

        assertEquals(4, square.apply(2))
        assertEquals(25, square.apply(5))
        assertEquals(625, square.apply(25))
    }

    @Test
    fun testMathFunctions_2() {
        val square: (Int) -> Int = { it * it }

        assertEquals(4, square(2))
        assertEquals(25, square(5))
        assertEquals(625, square(25))
    }

    @Test
    fun testMathFunctions_3() {
        val data = listOf(1, 2, 3, 4, 23, 45)

        assertEquals(mutableListOf(45, 23), data.filter { it > 12 }
            .sortedDescending()
            .toMutableList())
    }
}