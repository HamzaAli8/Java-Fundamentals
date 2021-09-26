package labs_examples.datastructures.stack.labs;

public class Main {

    public static void main(String[] args) {

        StackArray arr = new StackArray();

        arr.push(12);



        arr.doubleCapacity();
        arr.doubleCapacity();

        arr.halfCapacity();
        arr.halfCapacity();
        arr.halfCapacity();

        System.out.println(arr.capacity());

        System.out.println(arr.size());






    }
}
