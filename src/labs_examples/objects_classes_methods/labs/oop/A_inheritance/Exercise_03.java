package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?

 *
 * You answer:
 * * The superclasses have to be created first before the derieved subclasses can.
 *  * In this particular case as C extends from B and it extends from A.
 *  * When the C constructor is called it has to go up the hierarchy and see,
 *  * where the call is being made from.
 *
 */



public class Exercise_03 {
    public static void main(String[] args)
    {
        C_1 c = new C_1();
    }
}
