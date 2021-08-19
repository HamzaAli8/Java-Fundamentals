package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

public class GenericClass1<T>{

    T val;
    T val2;


    public GenericClass1(T val){

        this.val = val;

    }

    public GenericClass1(T val, T val2){


        this.val = val;
        this.val2 = val2;
    }

    @Override
    public String toString() {
        return "GenericClass1{" +
                "val=" + val +
                " val2=" + val2 +
                '}';
    }
}




