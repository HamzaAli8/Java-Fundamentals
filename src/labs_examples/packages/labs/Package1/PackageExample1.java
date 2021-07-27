package labs_examples.packages.labs.Package1;


import labs_examples.packages.labs.Package2.PackageExample2;

public class PackageExample1 {

    protected static void protectExample(){

        System.out.println("I am in a protected method");

        PackageExample2.unprotectedExample();

    }

    public static void unprotectedExample(){

        System.out.println("I am in a default method");

    }
}
