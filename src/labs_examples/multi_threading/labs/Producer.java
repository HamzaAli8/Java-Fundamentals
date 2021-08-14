package labs_examples.multi_threading.labs;

import java.util.Random;

public class Producer implements Runnable{

    Thread thread;


    public Producer(String name){

        thread = new Thread(this,name);

        thread.start();


    }


    public void run() {
        try {
            Random r = new Random();

            while (true) {
                synchronized (Main.bucket) {
                    if (Main.bucket.size() < 100) {
                        int n = r.nextInt(1000);
                        Main.bucket.add(n);
                        Main.bucket.notifyAll();
                        System.out.println(Thread.currentThread().getName() + "  added value " +
                                n + " to the bucket");
                    } else {

                        Main.bucket.wait();
                    }
                }
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

