package functional

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestFunctional {

    @Test
    fun testLambdas() {
        val numbers = listOf(1, -2, 3, -4, 5, -6)
        val positives = numbers.filter { x -> x > 0 }
        val negatives = numbers.filter { x -> x < 0 }

        assertTrue(listOf(1, 3, 5) == positives)
        assertTrue(listOf(-2, -4, -6) == negatives)
    }
}