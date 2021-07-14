package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 * The answer that is printed is 10.
 * The reason for is that the instance variable created in the A class is the one being called.
 * As soon as the the object is instantiated it has variable  i = 10.
 *
 * Your answer:
 *
 */
//class A {
//    int i = 10;
//}
//
////class B extends A{
//    int i = 20;
//}

public class Exercise_02 {

    public static void main(String[] args) {

        A a = new B();
        B b = new B();


        System.out.println(a.i);
        System.out.println(b.i);
        a.runs();


    }
}