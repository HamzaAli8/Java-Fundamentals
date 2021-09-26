package labs_examples.datastructures.stack.labs;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */
import java.util.*;
class StackMethods{


    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();


        for(int i = 0 ; i <= 15; i++){

            myStack.push(i);
        }

        Integer element = myStack.peek();
        System.out.println("Element on stack top: " + element);


        myStack.pop();
        myStack.pop();

        element = myStack.peek();
        System.out.println("Element on stack top: " + element);

        myStack.push(45);
        System.out.println(myStack.capacity());

        myStack.add(4,23);

        int last = myStack.lastElement();

        System.out.println(last);

        System.out.println(myStack.size());

        Object[] arr = myStack.toArray();

        String s = Arrays.deepToString(arr);

        System.out.println(s);



    }
}
