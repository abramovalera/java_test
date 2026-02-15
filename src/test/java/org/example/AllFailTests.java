package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllFailTests {

    @Test
    void test1_shouldFail() {
        fail("test1 failed on purpose");
    }

    @Test
    void test2_shouldFail() {
        assertTrue(false);
    }

    @Test
    void test3_shouldFail() {
        assertEquals(1, 2);
    }

    @Test
    void test4_shouldFail() {
        assertNull("not null");
    }

    @Test
    void test5_shouldFail() {
        throw new AssertionError("test5 failed on purpose");
    }
}
