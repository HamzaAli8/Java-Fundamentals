package labs_examples.multi_threading.labs;

public class IncrementOdd implements Runnable {

    public static Thread thread;


    public IncrementOdd(String name){

        thread = new Thread(this, name);
        try {Thread.sleep(10);} catch (InterruptedException e){e.printStackTrace();}
        thread.start();

    }


    @Override
    public void run() {
                for(int i = 1; i <= 100; i+= 2){
                System.out.println("Number: " + i +  "--" + Thread.currentThread().getName());
                }
    }
}

