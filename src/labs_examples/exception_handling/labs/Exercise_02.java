package labs_examples.exception_handling.labs;

public class Exercise_02 extends Exception{

    /**
     * Exception Handling Exercise 2:
     *
     *      Demonstrate a try/catch with multiple catch statements.
     *
     */


    public static void main(String[] args) {

        int [] numer = {6,12,15,20};

        int [] denom = {2,0,4,6};

        for(int i = 0; i < numer.length; i++ )


        try{


            { System.out.println(numer[i]/denom[i]); }
        }



        catch(ArithmeticException exc2){

            System.out.println("arithmetic exception cannot divide by zero");
        }

        try{

            numer[9] = 25;
        }

        catch(IndexOutOfBoundsException exc1){

            System.out.println("out of bounds exception");
        }

    }







}








