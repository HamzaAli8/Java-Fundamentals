package labs_examples.multi_threading.labs;

public class IncrementEven implements Runnable {

    public IncrementEven() {
    }

    @Override
    public void run() {
         {
                for (int i = 0; i <= 100; i += 2) {
                    Sequence.Box.add(i);
                    try {Thread.sleep(500);} catch (InterruptedException e){}
                    System.out.println("Number: " + i + "--" + Thread.currentThread().getName());
                }
         }
    }
}

