package Hamza;


public class Cat{

    int age;
    String name;
    String color;
    static int numberOfLegs = 4;
    public void about(int a, String name, String coatColor){

        int nextYear = a + 1;
        System.out.println(name + " is "+ age + "." + " It has " + color + " coloured fur" );
        System.out.println("All cats have "+ numberOfLegs + " legs");
        System.out.println("Next year, this cat will be "+ nextYear + " years old.");

    };

    public static void main(String[] args) {


        Cat Tom = new Cat();
        Cat Bubbles = new Cat();
        Tom.name = "Tom";
        Tom.age = 3;
        Tom.color = "Grey";
        Bubbles.age = 5;
        Bubbles.name = "Bubbles";
        Bubbles.color = "black";
        Bubbles.about(Bubbles.age, Bubbles.name, Bubbles.color);
        Tom.about(Tom.age, Tom.name, Tom.color);

    }

























}