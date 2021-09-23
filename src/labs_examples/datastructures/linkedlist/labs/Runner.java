package labs_examples.datastructures.linkedlist.labs;

public class Runner {

    public static void main(String[] args) {


        MyLinkedList <Integer> list = new MyLinkedList<>();

        list.addFirst(3);
        list.addFirst(6);
        list.addLast(9);
        list.addFirst(8);

        list.display();

        list.removeMiddle(3);

        System.out.println();

        list.display();
    }
}
