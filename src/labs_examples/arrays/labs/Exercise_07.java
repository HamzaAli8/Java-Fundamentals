package labs_examples.arrays.labs;
import java.util.ArrayList;
import java.util.Collections;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Merceds");
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Skoda");
        cars.add("Renault");
        cars.add("Audi");
        cars.add("Ford");
        cars.add("GMC");
        cars.add("Toyota");


        System.out.println(cars);



        cars.set(8, "Opel");

        Collections.sort(cars);

        System.out.println(cars.size());

        for(String i : cars){

            System.out.println(i);
        }



    }
}
