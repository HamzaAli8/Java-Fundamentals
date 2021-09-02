package labs_examples.lambdas.labs;

import java.util.Scanner;
import java.util.function.*;

public class Java_Functional_Interfaces {


    public static void main(String[] args) {
        // 1. Example of a basic consumer:

        Person p = new Person();

        Consumer<Person> setAge = (t) -> t.setAge(34);

        setAge.accept(p);

        System.out.println(p.getAge());

        // 2. Example of basic supplier:

        Person p2 = new Person("Hamza", 56);

        Supplier<Integer> getAge = () -> p2.getAge();

        System.out.println(getAge.get());

        // 3. Example DoubleToIntFunction:

        DoubleToIntFunction obj = (double a) -> (int) (a + a);

        System.out.println(obj.applyAsInt(4.56));

        Scanner scanner = new Scanner(System.in);

        //System.out.println("Please write two strings:");


        //String s = scanner.next();
        //String t = scanner.next();

       // BiPredicate<String, String > longerString = (x,y) -> s.length() > t.length();


      //  System.out.println(longerString.test(s,t));

        // 4. Example of BiConsumer

        BiConsumer<String, String> editor = (n,m) -> m.toLowerCase();
        editor.accept("LOVE", "YOU");

        // 5. Example of BiFunction


        BiFunction<Integer, Integer, Integer> divide = (v , j) -> {

            try{
                if(j == 0){
                    System.out.println("Cannot divide by zero!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


            return v/j;
        };

        int x = divide.apply(3456,56);

        System.out.println(x);

        // 6. Example of function

        Function<String ,Integer> countLetters = (h) -> h.length();

        int g = countLetters.apply("My name is Hamza ali and I live in riyadh");

        System.out.println(g);

        // 7. Example of BiPredicate


        System.out.println("Give me tow numbers:");

        int b = scanner.nextInt();

        int d = scanner.nextInt();

        BiPredicate<Integer, Integer> bigger = (j,k) -> b > d;

        boolean c = bigger.test(b,d);

        System.out.println(c);

        // 8. Example DoubleFunction

        DoubleFunction multiplyDouble = (u) -> u * u * u;

        System.out.println(multiplyDouble.apply(3.86));









    }







}
