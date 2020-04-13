package edu.unicen.tallerjava;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Ejercicio4Test {
    @Test
    public void simpleTestSum() {
        Ejercicio4 ejer4 = new Ejercicio4();
        int sum = ejer4.sumar(Arrays.asList(1, 1, 1, 1));
        assertEquals(4, sum);
    }
}