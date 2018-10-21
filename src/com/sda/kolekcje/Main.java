package com.sda.kolekcje;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Array list jest implementacją tabicową
        // Linked list jest implementacja wiazana

        CustomList<String> customList = new CustomLinkedList<>();

        customList.add("Jeden");
        customList.add("Dwa");
        customList.add("Trzy");
        customList.add("Cztery");
        customList.add("Piec");
        customList.add("Szesc");

        customList.addTail("Szesc");
        customList.addTail("Piec");
        customList.addTail("Cztery");
        customList.addTail("Trzy");
        customList.addTail("Dwa");
        customList.addTail("Jeden");

        /**
        for (int i = 0; i < customList.size(); i++) {
            System.out.println(customList.get(i));
        }
         */

        customList.printList();

        customList.find(5);

    }
    /**
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
     */

}
