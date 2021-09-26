package labs_examples.datastructures.queue.labs;

public class QueueArray<T>{


        private T[] queue;

        private int size;

        private static final int INITIAL_SIZE= 10;



        public QueueArray(){

            queue= (T[]) new Object[INITIAL_SIZE];
            size = 0;
        }

        public void add(T data){

            if(queue.length == 0){

                throw new IllegalStateException();
            }

            queue[size] = data;
            size++;
        }

        public int size(){

            return size;
        }

        public T poll(){

            if(size == 0){
                throw new NullPointerException();
            }
            T result = queue[0];
            queue[0] = null;
            size--;
            for(int i = 0; i < queue.length-1; i++){

                queue[i]= queue[i+1];
            }

            return result;
        }

        public void display(){

            for(int i =0; i < queue.length; i++){

                if (queue[i] != null){

                    System.out.println(queue[i]);
                }
            }
        }


        public T peek(){

            if(size == 0){
                throw new NullPointerException();
            }
            return queue[0];
        }

        public void halfCapacity (){

            if(size < (queue.length)/4) {

                int halfCapacity = (queue.length/2) ;

                T[] newQueue= (T[]) new Object[halfCapacity];

                for (int i = 0; i < newQueue.length; i++) {

                    newQueue[i] = queue[i];
                }
                queue = newQueue;
            }
        }

        public int capacity(){

            return queue.length;
        }




        public void doubleCapacity (){

            int doubleCapacity = 2 * queue.length;

            T [] newQueue = (T[]) new Object[doubleCapacity];

            for(int i = 0; i < queue.length; i++){

                newQueue[i] = queue[i];
            }
            queue = newQueue;
        }
}
