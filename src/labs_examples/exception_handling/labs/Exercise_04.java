package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */


public class Exercise_04 {



    public static void main(String[] args) {

        try {

            try {

                int x = 9;

                int y = 0;

                int z = x / y;

                System.out.println(z);

                try {

                    int[] nums = new int[3];

                    nums[20] = 25;
                } catch (Exception exc) {


                    System.out.println(exc);
                }

            } catch (ArithmeticException exc1) {


                System.out.println(exc1);
            }
        }

        catch(Exception exc2){

            System.out.println("Handle outer most loop");
        }


        System.out.println("Rest of program has not stopped");




    }


}




