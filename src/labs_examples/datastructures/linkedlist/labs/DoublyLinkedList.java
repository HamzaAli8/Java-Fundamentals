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
    // Ensure that the delete method is just one method rather than having 3 methods.
    public void deleteAtEnd (){

        if (head == null){

            return;
        }

        else{

            current = head;

            while(current.getNext() != null){

                current = current.getNext();
            }
            current.getPrevious().setNext(null);
        }
     }

     public void deleteAtStart(){

        if(head == null){

            return;
        }
        else{

            head = head.getNext();
            head.setPrevious(null);
        }
     }

     public void deleteInMiddle(N data){

        if(head != null) {
            current = head;
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();

                if (current.getData() == data) {
                    if(current.getNext() != null){
                        previous.setNext(previous.getNext().getNext());
                        current.getNext().setPrevious(current.getPrevious());
                    }else previous.setNext(null);
                }
            }
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

