package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AllSkippedTests {

    @Test
    @Disabled("skipped for Jenkins demo")
    void test1_skipped() {
        assertTrue(true);
    }

    @Test
    @Disabled("skipped for Jenkins demo")
    void test2_skipped() {
        assertTrue(true);
    }

    @Test
    @Disabled("skipped for Jenkins demo")
    void test3_skipped() {
        assertTrue(true);
    }

    @Test
    @Disabled("skipped for Jenkins demo")
    void test4_skipped() {
        assertTrue(true);
    }

    @Test
    @Disabled("skipped for Jenkins demo")
    void test5_skipped() {
        assertTrue(true);
    }
}
