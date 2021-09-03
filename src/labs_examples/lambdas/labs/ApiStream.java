package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ApiStream {

    public static void main(String[] args) {


        int[] array = IntStream.range(1,16)
                .toArray();


        Arrays.stream(array).forEach(System.out::print);

        System.out.println();

        System.out.println(Arrays.stream(array).sum());


        Arrays.stream(array).
                map(element -> element * 2)
                .forEach(System.out::print);


        OptionalDouble x = Arrays.stream(array)
                .filter(element -> element < 10)
                .average();

        System.out.println(x);









    }
}
