package labs_examples.multi_threading.labs;

import java.util.ArrayList;
import java.util.List;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

public class Sequence {

    public static List<Integer> Box = new ArrayList<>();


    public static void main(String[] args) {

        IncrementOdd r1 = new IncrementOdd();
        IncrementEven r2 = new IncrementEven();

        Thread t1 = new Thread(r2,"Even Thread");
        Thread t2 = new Thread(r1, "Odd Thread");

        t1.start();
        try {Thread.sleep(20); } catch (InterruptedException e) { e.printStackTrace(); }
        t2.start();
    }
}
