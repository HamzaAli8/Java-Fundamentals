package labs_examples.datastructures.linkedlist.labs;

public class DoublyLinkedList<N> {


    DoubleNode<N> head;
    DoubleNode<N> current;
    DoubleNode<N> next;
    DoubleNode<N> previous;


    public void addToEnd(N data) {

        DoubleNode dNode = new DoubleNode(data);

        if (head == null) {
            head = dNode;
        } else {
            current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(dNode);
            dNode.setPrevious(current);
        }

    }

    public void addToStart(N data){

        DoubleNode dNode = new DoubleNode(data);

        if (head != null) {
            head.setPrevious(dNode);
            dNode.setNext(head);
        }
        head = dNode;
    }

    public void addAfter(N data, N insertAfter){

        DoubleNode dNode = new DoubleNode(data);

        if (head == null){

            head = dNode;
        }
        else {

            current = head;

            while(current.getNext() != null && current.getData() != insertAfter){

                current = current.getNext();

                if(current.getData() == insertAfter){

                    break;
                }
            }
            if (current.getNext() != null){
                current.getNext().setPrevious(dNode);
                dNode.setNext(current.getNext());
            }
            current.setNext(dNode);
            dNode.setPrevious(current);
        }
    }

    public void display() {

        current = head;

        while (current.getNext() != null) {

            System.out.println(current.getData());
            current = current.getNext();

        }
        System.out.println(current.getData());

    }
}

