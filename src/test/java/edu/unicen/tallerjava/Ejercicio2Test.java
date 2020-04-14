package edu.unicen.tallerjava;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import edu.unicen.tallerjava.Ejercicio2.Counter;
import edu.unicen.tallerjava.Ejercicio2.Tree;

public class Ejercicio2Test {
    Tree[] trees = new Tree[] { Ejercicio2.createTree("(4,(1,(2,(3,,),(4,(1,,),)),),(2,,))"),
            Ejercicio2.createTree("(4,(1,(1,(1,,),(4,(1,,),)),),(2,,))") /* randomTree(20000000, 1d) */
    };

    int[] results = new int[] { 4, 2 };

    @Test
    public void testTrees() {
        for (int i = 0; i < results.length; i++) {
            Tree t = this.trees[i];
            int result = Ejercicio2.process(t, 0, new HashMap<Integer, Counter>());
            assertEquals(this.results[i], result);
        }
    }
}