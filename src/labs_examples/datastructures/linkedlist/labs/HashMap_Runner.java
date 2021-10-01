package labs_examples.datastructures.linkedlist.labs;

import labs_examples.datastructures.hashmap.labs.MyHashMap;

import java.util.Arrays;

public class HashMap_Runner {

    public static void main(String[] args) {

        MyHashMap<Integer, String > e = new MyHashMap<>();

        e.put(23, "Hamza");
        e.put(33, "Ali");
        e.put(45, "Sami");
        e.put(55,"Smith");

        e.remove(45);


        e.clear();

        e.put(33,"Ryan");

        System.out.println(e);


    }
}
