package org.example.functional;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestVariables {

    @Test
    void testPrimitive() {
        int n = 12;

        /*
        byte b = (byte) 254;
        short s = (short) 23;
        long l = 12L;
        float f = 12.8f;
        double d = n + n;
        char letter = 'a';
        boolean bool = true;
        var number = 12;
*/
        var x = "hello";
        assertEquals(x.hashCode(), "hello".hashCode());
    }


    @Test
    void testVar() {
        var usersMap = new HashMap<>();
        usersMap.put("Kathe", 33);
        usersMap.put("Willy", 32);

        var unmodifiableMap = Collections.unmodifiableMap(usersMap);

        assertThrows(UnsupportedOperationException.class,
                () -> unmodifiableMap.put("other", 10000));

        assertEquals(Map.of("Kathe", 33, "Willy", 32), usersMap);
    }


    @Test
    void testOverflow() {

        int n = Integer.MAX_VALUE;

        int overflow = n + 1;

        System.out.println(overflow);
    }
}
