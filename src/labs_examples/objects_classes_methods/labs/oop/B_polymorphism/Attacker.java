package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Attacker extends OutfieldPlayer{


    public Attacker(int age, float height, String position, String foot) {
        super(age, height, position, foot);
    }

    void dribble(){

        System.out.println("Attacker dribbles");

    }

    void cross (){

        System.out.println("Attacker crosses");
    }

    void head (){

        System.out.println("Attacker heads");
    }

    void pass (int x){

        System.out.println("Attacker passes " + x + " yards");
    }


}
