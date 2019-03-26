package edu.unicen.tallerjava;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {

    public String getData() {
        String data = "--";
        Map<String, String> dataMap = new HashMap<>();
        processData(data, dataMap);
        return data + " " + dataMap.get("test");
    }

    private void processData(String data, Map<String, String> dataMap) {
        data = "A";
        dataMap.put("test", "B");
        dataMap.put("test2", data);
    }

    public static void main(String[] args) {
        Ejercicio1 ej = new Ejercicio1();
        System.out.println(ej.getData());
    }
}
