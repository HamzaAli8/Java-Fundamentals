package labs_examples.generics.labs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;


/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Generic{



    public <T extends Number> double add (T x, T y){


        return x.doubleValue() + y.doubleValue();
    }


    public <T extends String> void isPalindrome(T [] array){

        int count = 0;

        for(T element : array){


            T original;

            String reverse = "";

            original = element;

            int length = original.length();

            for(int i = length -1; i >= 0; i--){

                reverse = reverse + original.charAt(i);
            }
            if (original.equalsIgnoreCase(reverse)){


                System.out.println("String entered is a palindrome");

                count++;


            }

            else System.out.println("String not a palindrome");
        }
        System.out.println(count);
    }


    public <T extends Number> void swap(T [] array){



        for(T element : array){


            T temp = null;

            temp = array[0];

            array[0] = array[array.length - 1];

            array[array.length - 1] = temp;
        }

        System.out.println(Arrays.toString(array));
}

    public <T extends Double > void biggest(T [] array){

        T max = array[0];

        for (T element : array){

            if(max.compareTo(element) < 0){

                max = element;
            }

        }

        System.out.println(max.doubleValue());




    }











    public static void main(String[] args) {

//        Generic g1 = new Generic();

//        System.out.println(g1.add(3,4));


//        Generic g2 = new Generic();

//        String [] stArray = {"peep", "honest", "loud", "boob", "kik" };

//        g2.isPalindrome(stArray);

          Generic g3 = new Generic();

          Integer [] IArray = {65,4,12,3,66,98,43};

          Double [] DArray = {3.56,8.88,3.66,4.22,8.87};

//        g3.swap(IArray);

          g3.biggest(DArray);








    }



}