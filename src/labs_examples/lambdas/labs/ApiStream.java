package labs_examples.lambdas.labs;

import javax.swing.plaf.SeparatorUI;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ApiStream {



    public static void main(String[] args) {


        int[] array = IntStream.range(1,16)
                .toArray();


        Arrays.stream(array).forEach(System.out::print);

        System.out.println();

        System.out.println(Arrays.stream(array).sum());


        IntStream.of(array).
                map(element -> element * 2)
                .forEach(System.out::print);

        System.out.println();


        double x = IntStream.of(array)
                .filter(element -> element < 10)
                .average().getAsDouble();

        System.out.println(x);


        int y = IntStream.of(array).reduce((element1, element2)-> element1 + element2)
                .getAsInt();

        System.out.println(y);

        String fileName = "/Users/Hamza/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/lambdas/labs/stream_text_lab.csv";

        try (Stream<String> stream = Files.lines(Paths.get(fileName))){

            stream.forEach(System.out::println);
        } catch (IOException e){

            e.printStackTrace();
        }



        try (Stream<String> stream = Files.lines(Paths.get(fileName))){

                stream.map(lines -> Arrays.asList(lines.split(",")))
                        .forEach(System.out::println);

        } catch (IOException e){

            e.printStackTrace();
        }


        List <Integer> numbers = Arrays.asList(3,5,6,7,8,9,10,2,3,4,5,6,3);


        boolean answer = numbers.stream()
                .allMatch(e -> e % 3 == 0);

        System.out.println(answer);

        Stream <String> names = Stream.of("Hamza", "Ryan","Ace", "John");

        boolean answer2 = names.anyMatch(str -> str.length() > 4);

        System.out.println(answer2);

        Stream <String> names2 = Stream.of("Hamza", "Ryan","Ace", "John");

        List <String> longNames = names2.filter(s -> s.length() > 3)
                .collect(Collectors.toList());

        System.out.println(longNames);





















    }
}
