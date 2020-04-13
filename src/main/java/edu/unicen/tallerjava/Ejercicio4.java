package edu.unicen.tallerjava;

import java.util.List;

public class Ejercicio4 {
    int sum;

    public int sumar(List<Integer> asList) {
        for (Integer integer : asList)
            sum += integer;
        return sum;
    }
}