package labs_examples.arrays.labs;

import java.util.Arrays;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        int [] oneDArray = {11,23,37,49,57,60,78,88,93,103};

        for (int i = oneDArray.length-1; i > 0; i--){

            if(i%2 == 0){

                continue;
            }

                System.out.print(oneDArray[i] + " ");
            }
        System.out.println();

        }

    }

