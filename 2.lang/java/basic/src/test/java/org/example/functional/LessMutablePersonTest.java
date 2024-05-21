package org.example.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LessMutablePersonTest {

    @Test
    void testBadFunction() {
        LessMutablePerson m = new LessMutablePerson("William", "rodriguez", new ArrayList<>());
        LessMutablePerson.badFunction(m);

        assertEquals(1, m.getEmails().size());
        assertEquals("rodriguez", m.getLastName());
    }
}