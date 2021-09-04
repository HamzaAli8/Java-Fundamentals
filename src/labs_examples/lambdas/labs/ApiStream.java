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

    private static final String SEPARATOR = ",";

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

        stream.map(lines -> Arrays.asList(lines.split(SEPARATOR)))
                    .forEach(System.out::println);




        } catch (IOException e){

            e.printStackTrace();
        }





















    }
}
