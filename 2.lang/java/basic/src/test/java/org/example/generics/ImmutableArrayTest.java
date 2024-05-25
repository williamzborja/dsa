package org.example.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ImmutableArrayTest {
    @Test
    void testConstructor() {
        var expected = new String[]{"a", "b", "c"};
        var generic = new ImmutableArray<>(expected);

        assertArrayEquals(expected, generic.items());
    }

    @Test
    void testOf() {
        var generic = ImmutableArray.of(1, 2, 3);
        var expected = new Integer[]{1, 2, 3};

        assertArrayEquals(expected, generic.items());
    }


    @Test
    void testLength() {
        var generic = ImmutableArray.of(1, 2, 3);

        assertEquals(3, generic.length());
    }

    @Test
    void testGet() {
        var generic = ImmutableArray.of(1, 2, 3);

        assertEquals(2, generic.get(1));
    }

    @Test
    void testIterateWithFor() {
        var generic = ImmutableArray.of(1, 2, 3);
        var expected = new ArrayList<>();

        for (var i = 0; i < generic.length(); i++) {
            expected.add(generic.get(i));
        }

        assertArrayEquals(expected.toArray(), generic.items());
    }


    @Test
    void testIterateObjects() {
        var generic = ImmutableArray.of(new GenericType<>(1), new GenericType<>(2), new GenericType<>(3));
        var expected = new ArrayList<>();

        for (var i = 0; i < generic.length(); i++) {
            expected.add(generic.get(i));
        }

        assertArrayEquals(expected.toArray(), generic.items());
    }
}