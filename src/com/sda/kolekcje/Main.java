package com.sda.kolekcje;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Array list jest implementacją tabicową
        // Linked list jest implementacja wiazana
        List<String> list = new LinkedList<>();

        list.add("Jan");
        list.add("Tomek");
        list.add("Marek");
        list.add("Zdzichu");
        list.add("Szymon");
        list.add("Wojtek");
        list.add("Slawomir");

        for (String l: list){
            System.out.println(l);
        }

    }
}
