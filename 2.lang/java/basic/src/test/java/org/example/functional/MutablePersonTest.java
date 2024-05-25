package org.example.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MutablePersonTest {

    @Test
    void testBadFunction() {
        MutablePerson m = new MutablePerson("William", "rodriguez", new ArrayList<>());
        MutablePerson.badFunction(m);

        assertEquals(1, m.getEmails().size());
        assertEquals("hacked", m.getFirstName());
    }
}