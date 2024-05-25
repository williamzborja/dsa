package functional

import kotlin.test.Test
import kotlin.test.assertEquals


class ImmutablePersonTest {
    @Test
    fun testMutablePerson() {
        val person = ImmutablePerson(
            lastName = "rodriguez",
            emails = listOf("mail@mail.com")
        )
        assertEquals(1, person.emails.size)
        assertEquals("rodriguez", person.lastName)
        assertEquals("Work", person.category)
    }
}