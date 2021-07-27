package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Defender extends OutfieldPlayer{

    public Defender(int age, float height, String position, String foot) {
        super(age, height, position, foot);
    }

    void head (){

        System.out.println("defender heads clear");
    }

    void tackle(){

        System.out.println("hard tackle!!");
    }
}
