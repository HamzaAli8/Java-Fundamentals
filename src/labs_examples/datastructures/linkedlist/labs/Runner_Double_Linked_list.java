package labs_examples.datastructures.linkedlist.labs;

public class Runner_Double_Linked_list {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        //list.addToEnd(3);
        list.addToStart(3);
        list.addToEnd(5);
        list.addToEnd(9);

        list.addAfter(10,9);




        list.display();


    }
}
