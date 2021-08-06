package labs_examples.exception_handling.labs;

public class Exercise_01 extends Exception{

    /**
     * Exception Handling Exercise 1:
     *
     *      1) Demonstrate a try/catch.
     *
     */


    public static void main(String[] args) {


        try{

            int [] nums  = new int [5];

            nums[6] = 23;
        }

        catch (IndexOutOfBoundsException exc){


            System.out.println("Exception caught");
        }

        System.out.println("Program continues");





    }





















}



