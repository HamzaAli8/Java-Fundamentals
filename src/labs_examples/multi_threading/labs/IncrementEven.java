package labs_examples.multi_threading.labs;

public class IncrementEven implements Runnable {

    Thread thread;


    public IncrementEven(String name) {

        thread = new Thread(this, name);

        thread.start();
    }

    @Override
    public void run() {

            for (int i = 0; i <= 100; i += 2) {

                System.out.println("Number: " + i + "--" + Thread.currentThread().getName());
            }
        }
    }
