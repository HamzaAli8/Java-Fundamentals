package labs_examples.multi_threading.labs;

public class MySecondRunnable implements Runnable {

    Thread thread;


    public MySecondRunnable(String name){

        thread = new Thread(this,name);

        thread.start();

    }

    @Override
    public void run() {

        for(int i = 0; i < 10; i++){


            System.out.println("I am printing from this thread called: " + Thread.currentThread().getName());
        }
    }

}

