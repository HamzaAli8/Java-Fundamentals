package labs_examples.exception_handling.labs;

public class TooYoungException extends Exception {

    public TooYoungException(String s){

        super(s);
    }


    /**
     * Exception Handling Exercise 7:
     *
     *      1) Create a custom exception.
     *      2) Demonstrate a method throwing your custom exception.
     */


    static void checkAge(int age) throws TooYoungException {

        if (age < 18){

            throw new TooYoungException("Too young to enter!");

        }
        else
            System.out.println("Welcome to the club");


    }

    public static void main(String[] args) {


        try{

            checkAge(17);
        }
        catch (Exception exc){

            System.out.println("Exception caught, individual is too young");
        }
    }

}


