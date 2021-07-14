package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Goalkeeper extends Player{

    public Goalkeeper(int age, float height, String position, String foot){
        super(age,height,position,foot);
    }


    void save(){
        System.out.println("Great save!!");
    }

}
