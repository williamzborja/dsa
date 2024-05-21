package org.example.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.example.functional.ImmutablePerson.badFunction;
import static org.junit.jupiter.api.Assertions.*;

class ImmutablePersonTest {

    @Test
    void testBadFunction() {
        ImmutablePerson m = new ImmutablePerson(
                "William",
                "rodriguez",
                new ArrayList<>()
        );

        assertThrows(UnsupportedOperationException.class, () -> badFunction(m));
        assertEquals(0, m.emails().size());
    }


    @Test
    void testBadFunction_2() {
        ImmutablePerson_2 m = new ImmutablePerson_2(
                "William",
                "rodriguez",
                new ArrayList<>()
        );

        ImmutablePerson_2.badFunction(m);

        assertEquals(0, m.emails().size());
    }
}