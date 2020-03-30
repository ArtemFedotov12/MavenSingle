package com.start;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DumpTest {

    @Test
    public void dumpFirstTest() {
        int x = 5;
        int y = 6;
        assertEquals(11, x + y);
    }

    @Test
    public void dumpSecondTest() {
        int x = 15;
        int y = 6;
        assertEquals(21, x + y);
    }

    @Test
    public void dumpThirdTest() {
        int x = 15;
        int y = 6;
        assertEquals(210, x + y);
    }

}
