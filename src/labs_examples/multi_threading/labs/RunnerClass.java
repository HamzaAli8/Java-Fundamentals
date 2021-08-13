package labs_examples.multi_threading.labs;

public class RunnerClass {

    public static void main(String[] args) {


        MyFirstRunnable r1 = new MyFirstRunnable();
        Thread t1 = new Thread(r1,"Thread 1" );
        t1.start();

    }




}
