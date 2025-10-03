package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {   // El nombre coincide con el archivo
    @Test
    public void simpleTest() {
        assertEquals(2, 1 + 1);
    }
}
