package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

public class Main{

    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();

        list.add(3);
        list.addFirst(3);
        list.addLast(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);

        System.out.println("The old LinkedList is "+ list);

        Collection<Integer> collect = new ArrayList<>();

        collect.add(15);
        collect.add(17);
        collect.add(19);
        collect.add(21);


        list.addAll(collect);

        System.out.println("The LinkedList is: " + list);

        list.pop();

        list.push(11);
        list.push(4);

        System.out.println(list);



        int x = list.get(3);



        System.out.println(x);

        ListIterator list_iter = list.listIterator(9);

        while(list_iter.hasNext()){

            System.out.println(list_iter.next());
        }

        boolean y = list.contains(8);

        System.out.println(y);

        list.clear();












    }

}