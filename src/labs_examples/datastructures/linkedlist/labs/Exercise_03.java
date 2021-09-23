package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */


class DoubleNode<N>{

    private N data;

    private DoubleNode<N> next;

    private DoubleNode<N> previous;



    public DoubleNode (){

    }

    public DoubleNode (N data){

        this.data = data;
    }


    public DoubleNode (N data, DoubleNode next, DoubleNode previous){

        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public N getData() {
        return data;
    }

    public void setData(N data) {
        this.data = data;
    }

    public DoubleNode<N> getNext() {
        return next;
    }

    public void setNext(DoubleNode<N> next) {
        this.next = next;
    }

    public DoubleNode<N> getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode<N> previous) {
        this.previous = previous;
    }
}
