package labs_examples.objects_classes_methods.labs.methods;


public class Generic <E> {


    private E[] elements;


    public void printArray(E[] elements) {


        for (E c: elements){

            System.out.println(c);
        }
    }
}






