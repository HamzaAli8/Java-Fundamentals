package labs_examples.multi_threading.labs;

import java.util.ArrayList;

public class IncrementOdd implements Runnable {

    public IncrementOdd() {

    }


    @Override
    public void run() {
         {
            for (int i = 1; i <= 100; i += 2) {
                Sequence.Box.add(i);
                try {Thread.sleep(500);} catch (InterruptedException e){}
                System.out.println("Number: " + i + "--" + Thread.currentThread().getName());
            }
        }
    }
}

