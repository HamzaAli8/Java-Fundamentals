package labs_examples.exception_handling.labs;

public class Exercise_03 {

    public static void main(String[] args) {

        try{

            int[] nums = new int[6];

            nums[10] = 12;
        }

        catch(Exception exc){


            System.out.println("Caught out of bounds exception");
        }

        finally {
            System.out.println("this always executes");
        }
    }


}

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
