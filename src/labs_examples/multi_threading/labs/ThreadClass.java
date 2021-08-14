package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

public class ThreadClass extends Thread{


    public ThreadClass(String name){

        setName(name);

    }

    @Override
    public void run() {
        super.run();
        try{

            for(int i = 1; i < 11; i +=2){

                Thread.sleep(500);

                System.out.println(i + " This my extended Thread class " + Thread.currentThread().getName());

            }
        }
        catch (Exception e){

            System.out.println("Exception thrown");
        }







    }
}