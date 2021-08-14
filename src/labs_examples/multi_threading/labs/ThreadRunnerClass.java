package labs_examples.multi_threading.labs;

public class ThreadRunnerClass {

    public static void main(String[] args) {


        ThreadClass t1 = new ThreadClass("Thread 1");
        t1.start();
        ThreadClass t2 = new ThreadClass("Thread 2");
        t2.start();
    }





}
