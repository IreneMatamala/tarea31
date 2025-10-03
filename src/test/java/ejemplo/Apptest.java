package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void simpleTest() {
        assertEquals(2, 1 + 1, "1 + 1 debería ser 2");
    }
}
