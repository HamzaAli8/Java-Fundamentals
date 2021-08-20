package labs_examples.generics.labs;

public class MainGen1 {


    public static void main(String[] args) {
        GenericClass1 <Integer> ob = new GenericClass1(23);
        GenericClass1 <String> ob2 = new GenericClass1<>("Hamza");
        GenericClass1 <Double> ob3 = new GenericClass1<>(3.45);

        GenericClass1 <String> ob4 = new GenericClass1<>("Hamza", "Ali");

        GenericClass1 <Long> ob5 = new GenericClass1<>(34930048549L, 400394030040940L);

        System.out.println(ob4);
        System.out.println(ob);
        System.out.println(ob3);
        System.out.println(ob5);

    }
}
