package labs_examples.lambdas.labs;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {

    public static void main(String[] args) {

        RunInterface myLambda = () -> System.out.println("Hello World!");

        myLambda.run();

        RunInterface obj = new RunInterface() {
            @Override
            public void run() {
                System.out.println("Hello World! Inner");
            }
        };
        obj.run();

        RunInterface2 obj2 = (int a) -> a + a;

        System.out.println(obj2.add(3));

        RunInterface3 obj3 = (double x, double y) -> x * y;

        System.out.println(obj3.multiply(3.6,3.99));

        RunInterface3 obj5 = new RunInterface3() {
            @Override
            public double multiply(double x, double y) {
                return x * y;
            }
        };

        System.out.println(obj5.multiply(4.56,5.89));

        Predicate <Integer> obj4 = integer -> integer > 10;
        System.out.println(obj4.test(8));

        Function <Double, Double> add = (x) -> x + x;

        System.out.println(add.apply(5.55));

        BiFunction <Double,Double,Double> multiply = (x,y) -> x * y;

        System.out.println(multiply.apply(99.98,456.767));

    }
}
