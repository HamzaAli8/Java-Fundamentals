package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Midfielder extends OutfieldPlayer{


    public Midfielder(int age, float height, String position, String foot) {
        super(age, height, position, foot);
    }


    void tackle(){

        System.out.println("midfielder tackles");
    }



    void pass (int x){

        System.out.println("midfielder passes " + x + " yards");
    }

    void cross (){

        System.out.println("midfielder crosses");
    }

    void head (){

        System.out.println("midfielder heads");
    }

}



