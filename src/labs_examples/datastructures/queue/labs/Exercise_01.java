package labs_examples.datastructures.queue.labs;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

class QueueMethods{

    public static void main(String[] args) {

        Queue<Integer> numbers = new PriorityQueue<>();


        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);
        numbers.add(15);
        numbers.add(18);
        numbers.add(21);

        numbers.poll();
        numbers.poll();

        boolean has = numbers.offer(14);


        int x = numbers.peek();

        Object[] arr = numbers.toArray();

        String s = Arrays.deepToString(arr);

        System.out.println(s);

        System.out.println(x);
        System.out.println(has);

    }



}
