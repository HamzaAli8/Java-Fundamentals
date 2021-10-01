package labs_examples.datastructures.linkedlist.labs;

import java.util.HashMap;

public class Runner_Double_Linked_list {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        //list.addToEnd(3);
        list.addToStart(3);
        list.addToEnd(5);
        list.addToEnd(7);

        list.addAfter(9,7);

        list.deleteInMiddle(7);




        list.display();

        HashMap<String, String> e = new HashMap<>();

        e.clear();


    }
}
