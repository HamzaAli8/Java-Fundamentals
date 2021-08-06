package labs_examples.exception_handling.labs;

public class Exercise_06 {

    /**
     * Exception Handling Exercise 6:
     *
     *      Demonstrate throwing an exception in one method and catching it in another method.
     *
     */


    public static void main(String[] args) {

        try{
            System.out.println("Before throw");
            throw new ArrayIndexOutOfBoundsException();
        }
        catch (ArrayIndexOutOfBoundsException exc){

            System.out.println(exc);
        }

        try{

            throwMethod();
        }

        catch (ArithmeticException exc1){

            System.out.println("Caught from throwMethod");

        }

    }

    static void throwMethod(){

        throw new ArithmeticException();

    }

}



