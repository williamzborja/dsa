package org.example.functional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {


    @Test
    void testString() {
        String algo = "andres";
        String algo2 = "andres";
        String other = "andres";

        assertEquals(algo2.hashCode(), algo.hashCode());
        assertEquals(other.hashCode(), algo.hashCode());
        assertEquals(other, algo);
        assertEquals(algo, other);
        assertNotEquals(algo, other);
    }
}
