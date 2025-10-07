package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
    @Test
    public void testSuma() {
        assertEquals(4, App.sumar(2, 2));
    }
    
    @Test
    public void testSumaConCero() {
        assertEquals(5, App.sumar(5, 0));
    }
}
