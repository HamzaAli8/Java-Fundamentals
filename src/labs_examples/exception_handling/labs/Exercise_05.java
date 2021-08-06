package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {

        try{

            throw1();
        }
        catch (ArrayIndexOutOfBoundsException exc1){


            System.out.println("this the only exception i can catch");
        }


    }

    static void throw1(){


        throw new ArrayIndexOutOfBoundsException();

    }

}