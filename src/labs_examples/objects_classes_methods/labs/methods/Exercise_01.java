package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println(multiply(8,9));
        System.out.println(divide(36,6));
        printJoke();
        yearInSeconds(12);
        int vars3 = varArgs("I", "am","Legend");
        int vars2 = varArgs("I", "am");
        int vars1 = varArgs("I");

        System.out.println(vars1);
        System.out.println(vars2);
        System.out.println(vars3);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b){

        return a * b;

    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static int divide(int x, int y){

        return x/y;
    }


    // 3) Create a static void method that will print of joke of your choice to the console

    public static void printJoke(){

        System.out.println("Why did the cow cross the road? It had to mooooooove");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    public static long yearInSeconds(long a){

        long sec  = a * 60 * 60 * 24 * 365;


        System.out.println("There are " + sec + " seconds"   + " in " + a + " years");

        return sec;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in

    public static int varArgs(String...values){
        int count = 0;
        for(String x: values){


            count ++;



        }

        return count;

    }






}
