package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Demo{

    public static <T extends Number> void addArray(T [] array){

            double sum = 0;

            for(T element : array){

                 sum += element.doubleValue();
            }
            System.out.println(sum);
        }


    public static void main(String[] args) {

        Integer [] iArray = {1,2,3,4,5,6,7,8,9,10};
        addArray(iArray);
        Double [] dArray = {2.34,3.56,5.66,7.88,9.56,4.56,6.34, 9.5};
        addArray(dArray);



    }
}