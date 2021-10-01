package labs_examples.datastructures.hashmap.labs;

import java.util.*;

/**
 *      HashMaps Exercise_02
 *
 *      Create a new class that does the following:
 *
 *      1) create a LinkedList
 *      2) create a Stack
 *      3) create a Queue
 *      4) create a HashMap
 *
 *      Then, add millisecond timers before and after each data structure above and print out
 *      how long it takes for each to complete EACH the following tasks, and the total time for
 *      each data structure:
 *
 *      1) add 100 elements
 *      2) update 100 elements
 *      3) search for 100 elements
 *      4) delete 100 elements
 */
class speedTest{

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        Stack<Integer> stack = new Stack<>();

        Queue<Integer> queue = new ArrayDeque<Integer>();

        HashMap<Integer,Integer> map = new HashMap<>();


        // Add elements

        System.out.println("Add before linked :"+ System.currentTimeMillis());

        for(int i = 1; i <= 100; i++){

            list.push(i * 2);
        }
        System.out.println("Add after linked :"+ System.currentTimeMillis());

        System.out.println();


        System.out.println("Add before stack :"+ System.currentTimeMillis());

        for(int i = 1; i <= 100; i++){

            stack.push(i);
        }
        System.out.println("Add after stack :"+ System.currentTimeMillis());

        System.out.println();


        System.out.println("Add before queue :"+ System.currentTimeMillis());


        for(int i = 1; i <= 100; i++){

            queue.add(i);
        }
        System.out.println("Add after queue :"+ System.currentTimeMillis());

        System.out.println();


        System.out.println("Add before map :"+ System.currentTimeMillis());

        for(int i = 1; i <= 100; i++){

            map.put(i,i);
        }
        System.out.println("Add after map :"+ System.currentTimeMillis());

        System.out.println();

        System.out.println("Find before map :"+ System.currentTimeMillis());
        map.get(3);
        System.out.println("Find after map :"+ System.currentTimeMillis());

        System.out.println();

        System.out.println("Find before map :"+ System.currentTimeMillis());
        list.contains(99);
        System.out.println("Find after map :"+ System.currentTimeMillis());













    }





}