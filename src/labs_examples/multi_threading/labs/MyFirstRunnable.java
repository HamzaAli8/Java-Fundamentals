package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

public class MyFirstRunnable implements Runnable{

    public MyFirstRunnable(){


    }

    @Override
    public void run() {

        for(int i = 0; i < 10; i++){


            System.out.println("I am printing from this thread called: " + Thread.currentThread().getName());
        }
    }
}




