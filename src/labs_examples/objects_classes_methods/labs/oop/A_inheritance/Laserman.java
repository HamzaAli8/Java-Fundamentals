package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Laserman extends CharacterAttack{

    private int charges;

    public Laserman(int level, int damageLevel, int charges) {
        super(level, damageLevel);
        this.charges = charges;
    }

    void fireLaser(){

        System.out.println("Laser fired!!");
    }

    void kick(){

        System.out.println("Laserman kicks!");
    }

    void punch(){

        System.out.println("Laserman punches!");
    }
}
