package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {

        int x = 20;

        while(x > 10){

            x--;
             if(x == 13){

                 System.out.println("Crap, we have hit the unlucky 13th!!");
                 break;
             }




        }

    }

}
