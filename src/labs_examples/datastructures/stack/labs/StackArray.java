package labs_examples.datastructures.stack.labs;

public class StackArray <T>{

    private T[] stack;

    private int size;

    private static final int INITIAL_SIZE= 10;



    public StackArray(){

        stack = (T[]) new Object[INITIAL_SIZE];
        size = 0;
    }

    public void push(T data){

        if(size == stack.length){

            doubleCapacity();
        }

        stack[size] = data;
        size++;
    }

    public int size(){

        return size;
    }

    public T pop(){

        if(size == 0){
            throw new NullPointerException();
        }
        T result = stack[size-1];
        stack[size-1] = null;
        size--;
        return result;
    }

    public void display(){

        for(int i =0; i < stack.length; i++){

            if (stack[i] != null){

                System.out.println(stack[i]);
            }
        }
    }

    public T peekFirst(){

        if(size == 0){
            throw new NullPointerException();
            }
        return stack[size-1];
    }

    public T peekLast(){

        if(size == 0){
            throw new NullPointerException();
        }
        return stack[0];
    }

    public void halfCapacity (){

        if(size < (stack.length)/4) {

            int halfCapacity = (stack.length/2) ;

            T[] newStack = (T[]) new Object[halfCapacity];

            for (int i = 0; i < newStack.length; i++) {

                newStack[i] = stack[i];
            }
            stack = newStack;
        }
    }

    public int capacity(){

        return stack.length;
    }



    public void doubleCapacity (){

        int doubleCapacity = 2 * stack.length;

        T [] newStack = (T[]) new Object[doubleCapacity];

        for(int i = 0; i < stack.length; i++){

            newStack[i] = stack[i];
        }
        stack = newStack;

    }
}
