package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        float r = 3.14f;
        int h = 5;
        float pi = 3.14f;

        double volumeCylinder = pi * (r*r) * h;
        double surfaceAreaCylinder = (2 * pi * r * h) + (2 * pi * (r * r));



        System.out.println(volumeCylinder);
        System.out.println(surfaceAreaCylinder);






    }
}