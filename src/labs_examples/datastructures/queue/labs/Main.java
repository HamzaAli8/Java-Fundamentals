package labs_examples.datastructures.queue.labs;

public class Main {

    public static void main(String[] args) {

        QueueArray myQueue = new QueueArray();

        myQueue.add(5);
        myQueue.add(10);
        myQueue.add(15);
        myQueue.add(20);
        myQueue.add(25);



        myQueue.poll();
        myQueue.poll();

        myQueue.display();







    }
}
