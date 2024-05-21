package org.example.functional.generics;

import org.example.generics.GenericType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericTypeTest {

    @Test
    void testGeneric() {
        var generic = new GenericType<>("hello");
        var generic2 = new GenericType<>(12);

        assertEquals("hello", generic.getT());
        assertEquals(Integer.valueOf(12), generic2.getT());


    }
}
