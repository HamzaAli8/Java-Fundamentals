package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class OutfieldPlayer extends Player {


    public OutfieldPlayer(int age, float height, String position, String foot){
        super(age,height,position,foot);


    }

    void tackle(){

        System.out.println("tackle");
    }

    void pass (){

        System.out.println("pass");
    }

    void cross (){

        System.out.println("cross");
    }

    void head (){

        System.out.println("head");
    }

    void score (){

        System.out.println("Scores!!!!");
    }


}
