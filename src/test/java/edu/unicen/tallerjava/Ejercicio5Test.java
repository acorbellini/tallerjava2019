package edu.unicen.tallerjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ejercicio5Test {
    @Test
    public void testReadable() {
        String ret = Ejercicio5.toReadableList("a", "b", "c");
        assertEquals("a, b and c", ret);
    }

    @Test
    public void testOne() {
        String ret = Ejercicio5.toReadableList("a");
        assertEquals("a", ret);
    }
    
    @Test    
    public void testTwo() {
        String ret = Ejercicio5.toReadableList("a", "b");
        assertEquals("a and b", ret);
    }
}