package edu.unicen.tallerjava;

public class Ejercicio5 {
    public static String toReadableList(String... elements) {
        String ret = "";
        for (int i = 0; i < elements.length; i++) {
            String element = elements[i];
            if (i == elements.length - 1)
                ret += " and " + element;
            else
                ret += element + ", ";
        }
        return ret;
    }
}