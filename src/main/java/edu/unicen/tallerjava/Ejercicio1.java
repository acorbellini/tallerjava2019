package edu.unicen.tallerjava;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {

    public String getData() {
        Map<String, String> dataMap = new HashMap<>();
        String data = null;
        processData(data, dataMap);
        return data + " " + dataMap.get("test");
    }

    private void processData(String data, Map<String, String> dataMap) {
        data = "A";
        dataMap.put("test", "B");
    }

    public static void main(String[] args) {
        Ejercicio1 ej = new Ejercicio1();
        System.out.println(ej.getData());
    }
}
