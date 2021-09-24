package labs_examples.datastructures.linkedlist.labs;

public class MyLinkedList<T> {


    Node<T> head;
    Node<T> previous;
    Node<T> current;
    Node<T> delete;

    // add method
    public void addLast(T data) {

        if (head == null) {
            head = new Node(data);
            return;
        }

        current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Node(data));
    }

    public void addFirst(T data) {

        if (head == null) {
            head = new Node<>(data);
            return;
        }
        Node<T> node = new Node<>(data, head);
        head = node;
    }

    // find method
    public T find(T data) throws Exception {

        if (head == null) {
            throw new Exception("Linked list is empty");
        }
        if (head.getData() == data) {
            return head.getData();
        }

        current = head;
        while (current.getNext() != null) {

            current = current.getNext();
            if (current.getData() == data) {

                return current.getData();
            }
        }
        throw new Exception("The value has not been found");
    }


    public void display() {

        current = head;

        while (current.getNext() != null) {

            System.out.println(current.getData());
            current = current.getNext();

        }
        System.out.println(current.getData());
    }

    // remove method
    public void removeFirst() {

        // Remove if first element

        if (head != null) {

            head = head.getNext();
        }

    }

    public void removeLast() {

        if (head != null) {

            current = head;

            while (current.getNext() != null) {

                previous = current;
                current = current.getNext();
            }
            previous.setNext(null);

        }
    }

    public void removeMiddle(T data) {

        if (head != null) {

            current = head;

            while (current.getNext() != null) {

                previous = current;
                current = current.getNext();

                if (current.getData() == data){
                    previous.setNext(previous.getNext().getNext());
                }

            }

        }

    }
}


