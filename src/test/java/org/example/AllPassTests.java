package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllPassTests {

    @Test
    void test1_shouldPass() {
        assertTrue(true);
    }

    @Test
    void test2_shouldPass() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void test3_shouldPass() {
        assertNotNull("hello");
    }

    @Test
    void test4_shouldPass() {
        assertFalse(1 > 2);
    }

    @Test
    void test5_shouldPass() {
        assertDoesNotThrow(() -> {});
    }
}
