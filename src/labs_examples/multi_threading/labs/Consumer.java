package labs_examples.multi_threading.labs;

import java.util.Random;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

public class Consumer implements Runnable{

    Thread thread;

    public Consumer(String name){

        thread = new Thread(this,name);

        thread.start();
    }

    @Override
    public void run() {
        try {
            Random r = new Random();

            while(true){
                synchronized (Main.bucket) {
                    if (!Main.bucket.isEmpty()) {
                        int n = Main.bucket.get(0);
                        Main.bucket.remove(0);
                        Main.bucket.notifyAll();
                        System.out.println(Thread.currentThread().getName() + " removed value " +
                                n + " from the bucket");
                    } else{

                        Main.bucket.wait();
                    }
                }
            }
        } catch (InterruptedException e){

            e.printStackTrace();
        }
    }
}